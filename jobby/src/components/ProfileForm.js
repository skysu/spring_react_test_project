import React, { useState } from 'react';

const ProfileForm = (props) => {
  const [firstName, setFirstName, handleFirstNameChange] = useFormInput(props.firstName || '');
  const [lastName, setLastName, handleLastNameChange] = useFormInput(props.lastName || '');

  // const [firstName, setFirstName] = useState(props.firstName);
  // const [lastName, setLastName] = useState(props.lastName);

  // handleFirstNameChange(e) {
  //   e.preventDefault();
  //   setFirstName(e.target.value)
  // }

  function handleSubmit(e) {
    e.preventDefault();
    addProfile();
  }

  function addProfile() {
    const request = {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        firstName: firstName,
        lastName: lastName
      })
    };
    fetch('http://localhost:8080/profiles', request)
      .then(res => res.json())
      .then(data => {
        props.onProfileSubmitted(data);
        resetForm();
      });
  }

  function resetForm() {
    setFirstName('');
    setLastName('');
  }

  return (
    <form onSubmit={handleSubmit} className="form">
      <div className="form__row">
        <label htmlFor="firstName">First Name</label>
        <input value={firstName} onChange={handleFirstNameChange} />
      </div>
      <div className="form__row">
        <label htmlFor="lastName">Last Name</label>
        <input value={lastName} onChange={handleLastNameChange} />
      </div>
      <button type="submit" className="form__btn">Add profile</button>
    </form>
  )
}

export default ProfileForm;

function useFormInput(initialValue) {
  const [value, setValue] = useState(initialValue);

  function handleChange(e) {
    setValue(e.target.value);
  }

  return [
    value,
    setValue,
    handleChange
  ]
}
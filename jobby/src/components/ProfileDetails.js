import React from 'react';

const ProfileDetails = ({ profile }) => {
  return (
    <section>
      <h3>{profile.firstName} {profile.lastName}</h3>
      <ul>
        {profile.jobbies && profile.jobbies.map(jobby => <li key={jobby.id}>{jobby.title} at {jobby.company.name} <img src={jobby.company.logo} /></li>)}
      </ul>
    </section>
  );
}

export default ProfileDetails;
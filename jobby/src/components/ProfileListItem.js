import React from 'react';
import { Redirect, Link } from 'react-router-dom';

const ProfileListItem = ({ profile, matchUrl, onProfileDelete }) => {

  function handleOnDeleteClick() {
    onProfileDelete(profile.id);
  }

  return (
    <li>
      <Link to={`${matchUrl}/${profile.id}`}>{profile.firstName} {profile.lastName}</Link>
      <button onClick={handleOnDeleteClick}>Delete</button>
    </li>
  );
}

export default ProfileListItem;
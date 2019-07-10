import React from 'react';
import ProfileListItem from './ProfileListItem';

const ProfileList = ({ profiles, matchUrl, onProfileDelete }) => {

  return (
    <ul>
      {profiles.map(profile => {
         return (
            <ProfileListItem 
              key={profile.id} 
              profile={profile} 
              matchUrl={matchUrl} 
              onProfileDelete={onProfileDelete}
            />
         )
        })}
    </ul>
  );

}

export default ProfileList;
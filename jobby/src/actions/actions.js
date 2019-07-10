import { types } from "../reducer/reducer";

const useActions = (state, dispatch) => {
  
  function fetchProfile(id) {
    fetch(`http://localhost:8080/profiles/${id}`)
      .then(res => res.json())
      .then(data => {
        dispatch({
          type: types.FETCHED_PROFILE,
          profile: data 
        })
      })
  }

  function fetchProfileJobbies(id) {
    fetch(`http://localhost:8080/profiles/${id}/jobbies`)
      .then(res => res.json())
      .then(data => {
        if (data._embedded && data._embedded.jobbies) {
          dispatch({
            type: types.FETCHED_PROFILE_JOBBIES,
            jobbies: data._embedded.jobbies
          })
        }
      })
  }

  function fetchProfiles() {
    fetch('http://localhost:8080/profiles')
      .then(res => res.json())
      .then(data => {
        if (data._embedded && data._embedded.profiles) {
          dispatch({
            type: types.FETCHED_PROFILES,
            profiles: data._embedded.profiles
          });
        }
      });
  }

  return { 
    fetchProfile,
    fetchProfileJobbies,
    fetchProfiles
  };

}

export default useActions;
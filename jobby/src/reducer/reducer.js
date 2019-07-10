const initialState = {
  profilesList: [],
  selectedProfileId: null,
  selectedProfile: {},
  selectedProfileJobbies: []
};

const types = {
  FETCHED_PROFILES: 'FETCHED_PROFILES',
  SELECTED_PROFILE_ID: 'SELECTED_PROFILE_ID',
  ADD_PROFILE: 'ADD_PROFILE'  
}

const reducer = (state = initialState, action) => {
  switch(action.type) {
    case types.FETCHED_PROFILES:
      return Object.assign({}, state, {
        profilesList: action.profiles
      });

    case types.FETCHED_PROFILE:
      return Object.assign({}, state, {
        profile: action.profile
      });

    case types.FETCHED_PROFILE_JOBBIES:
        return Object.assign({}, state, {
          selectedProfileJobbies: action.jobbies
        })

    case types.SELECTED_PROFILE_ID:
        return Object.assign({}, state, {
          selectedProfileId: action.id
        });

    case types.ADD_PROFILE:
        return Object.assign({}, state, {
          profilesList: [...state.profiles, action.profile]
        });

    default:
        return state;
  }
}

export { initialState, types, reducer };
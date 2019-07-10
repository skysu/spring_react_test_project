import React from 'react';
import ProfileList from '../components/ProfileList';
import ProfileForm from '../components/ProfileForm';

class ProfilesContainer extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      profiles: []
    }
    this.handleProfileSubmitted = this.handleProfileSubmitted.bind(this);
    this.handleProfileDelete = this.handleProfileDelete.bind(this);
  }

  componentDidMount() {
    this.fetchProfiles();
  }

  handleProfileSubmitted(profile) {
    this.setState(prevState => {
      return {
        profiles: [...prevState.profiles, profile]
      }
    });
  }

  handleProfileDelete(id) {
    this.deleteProfile(id);
  }
  
  fetchProfiles() {
    fetch('http://localhost:8080/profiles')
      .then(res => res.json())
      .then(data => {
        if (data._embedded && data._embedded.profiles) {
          this.setState({ 
            profiles: data._embedded.profiles 
          })
        }
      });
  }

  deleteProfile(id) {
    const request = {
      method: 'DELETE'
    };
    fetch(`http://localhost:8080/profiles/${id}`, request)
      .then(res => {
        if (res.ok) {
          this.setState(prevState => {
            return {
              profiles: prevState.profiles.filter(profile => profile.id !== id)
            }
          })
        }
      })
      
  }


  render() {
    return (
      <React.Fragment>
        <h2>ProfilesContainer</h2>
        <ProfileList 
          profiles={this.state.profiles} 
          matchUrl={this.props.match.url} 
          onProfileDelete={this.handleProfileDelete}
        />
        <ProfileForm onProfileSubmitted={this.handleProfileSubmitted}/>
      </React.Fragment>
    );
  }
}

export default ProfilesContainer;
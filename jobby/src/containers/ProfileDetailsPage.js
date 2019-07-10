import React from 'react';
import ProfileDetails from '../components/ProfileDetails';

class ProfileDetailsPage extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      profile: {}
    }
  }

  componentDidMount() {
    const id = this.props.match.params.id;
    this.fetchProfile(id);
  }

  componentDidUpdate(prevProps) {
    const newId = this.props.match.params.id;
    if (prevProps.match.params.id !== newId) {
      this.fetchProfile(newId);
    }
  }

 
  fetchProfile(id) {
    fetch(`http://localhost:8080/profiles/${id}`)
      .then(res => res.json())
      .then(data => {
        this.setState({ profile: data });
      })
  }

  render() {
    return (
      <React.Fragment>
        <h2>Profile Container</h2>
        <ProfileDetails profile={this.state.profile} jobbies={this.state.jobbies} />
      </React.Fragment>
    );
  }

}

export default ProfileDetailsPage;
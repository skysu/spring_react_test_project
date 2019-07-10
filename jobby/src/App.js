import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ProfilesPage from './containers/ProfilesPage';
import ProfileDetailsPage from './containers/ProfileDetailsPage';

const App = () => {

  return (
    <Router>
      <React.Fragment>
        <Switch>
          <Route exact path="/profiles" component={ProfilesPage} />
          <Route path="/profiles/:id" component={ProfileDetailsPage} />
        </Switch>
      </React.Fragment>
    </Router>
  );
}

export default App;

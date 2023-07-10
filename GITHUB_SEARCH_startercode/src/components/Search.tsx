import React, { useState } from 'react';
import axios from 'axios';
import './Search.css';

const Search: React.FC<{}> = () => {
  const [loading, setLoading] = useState<boolean>(false);
  const [url, setUrl] = useState<string>('');
  const [reposLink, setReposLink] = useState<string>('');
  const [userData, setUserData] = useState<any>(null);
  const [error, setError] = useState<string>('');

  const urlCreator = (e: React.ChangeEvent<HTMLInputElement>) => {
    const username = e.target.value;
    setUrl(`https://api.github.com/users/${username}`);
    setReposLink(`https://github.com/${username}?tab=repositories`);
  };

  const getUserData = async () => {
    setLoading(true);

    try {
      const response = await axios.get(url);
      setUserData(response.data);
      setError('');
    } catch (error) {
      setUserData(null);
      setError('User not found');
    }

    setLoading(false);
  };

  if (loading) {
    return <div className="spinner"></div>;
  }

  return (
    <div className="search-container">
      <input type="text" onChange={urlCreator} placeholder="Enter GitHub username" />
      <button onClick={getUserData}>Search</button>

      {error && <p>{error}</p>}

      {userData && (
        <div className="user-details">
          <img src={userData.avatar_url} alt="User Avatar" />
          <p>Username: {userData.login}</p>
          <p>Followers: {userData.followers}</p>
          <p>Following: {userData.following}</p>
          {/* Display additional user information as needed */}
          <a href={reposLink}>View Repositories</a>
        </div>
      )}
    </div>
  );
};

export default Search;

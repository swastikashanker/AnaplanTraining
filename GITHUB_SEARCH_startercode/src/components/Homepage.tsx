
import React from 'react'
import './Homepage.css'
import github from '../assests/github_new.webp'
import Navbar from './Navbar'
const Homepage: React.FC<{}> = () => {
  return (
     <div>
       <Navbar />
    <h1>Welcome to the GitHub_Search Application!</h1>
        <div className="maincont">
          <div className="thumbnail">
            <img src={github} />
             </div>
          <div className="captions">
            <h1>Welcome to the Git hub Search Platform</h1>
         </div>
        </div>
    </div>
  )
}
export default Homepage

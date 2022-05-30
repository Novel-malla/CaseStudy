import React from 'react'
import '../styles/register.css'

const Register = ({handleLogIn}) => {
  return (
    <div className='register-container'>
        <div class="register-container">
            <header>REGISTER</header>
            <form method="post">
            <div className="input-field">
                <input className='fullName' placeholder='Fullname'/>
                <input className='emailId' placeholder='Email'/>
                <input className='dateOfBirth' placeholder='DateOfBirth'/>
                <input className='gender' placeholder='Gender'/>
                <input className='password' placeholder='Password'/>
                <input className='confirmPassword' placeholder='Confirm Password'/>
                </div>
                <div className='button'>
                <button onClick={handleLogIn} className='login'>SignUp</button>
                </div>
            </form>
        </div>
    </div>
  )
}

export default Register;
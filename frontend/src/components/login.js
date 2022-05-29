import React from 'react'
import './Login.css';
import { Formik } from "formik";
import * as EmailValidator from "email-validator";
import * as Yup from "yup";

const Login = () => (
  <Formik
    initialValues={{ email: "", password: "" }}
    onSubmit={(values, { setSubmitting }) => {
      setTimeout(() => {
        console.log("Logging in", values);
        setSubmitting(false);
      }, 500);
    }}
  >

{props => {
  const {
    values,
    touched,
    errors,
    isSubmitting,
    handleChange,
    handleBlur,
    handleSubmit
  } = props;

  return (
    <div className='container'>
      <form onSubmit={handleSubmit}>
      <h1 style={{textAlign: 'center', fontWeight: 'lighter', marginTop: '20px'}}>LOGIN</h1>
      <div className='loginBox'>
        <input 
        id='emailInput' 
        placeholder='Enter your Email ID' 
        name='email' 
        type='text'
        value={values.email}
        onChange={handleChange}
        onBlur={handleBlur}
        className={errors.email && touched.email && "error"}
        />
        {errors.email && touched.email && (
          <div className="input-feedback">{errors.email}</div>
        )}
        
        <input 
        id='passInput' 
        placeholder='Enter Password' 
        type='password' 
        name='password'
        value={values.password}
        onChange={handleChange}
        onBlur={handleBlur}
        className={errors.password && touched.password && "error"}
        />
        {errors.password && touched.password && (
          <div className="input-feedback">{errors.password}</div>
        )}

        <button 
        className="loginPageBtn" 
        type='submit' 
        disabled={isSubmitting}>Log In</button>
      </div>
      </form>
    </div>
  )}}
  </Formik>
)

export default Login
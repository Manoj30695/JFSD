<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Navbar.css">
<link rel="stylesheet" href="/css/Admin_Login.css">
</head>
<body>
<nav>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="AdminLogin">Admin Login</a></li>
        <li><a href="EmpLogin">Employee Login</a></li>
    </ul>
</nav>

<div id="admin-login" class="login-container">
  <h3 style="color: green">${msg}</h3>
    <h2>Admin Login</h2>
    <form class="login-form" action="adminlogin" method="get">
        <input type="text" name="admin_username" placeholder="Username" required>
        <input type="password" name="admin_password" placeholder="Password" required>
        <input type="submit" value="Login">
        <div class="signup-link">
            <a href="AdminRegister">Don't have an account?</a>
        </div>
    </form>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Navbar.css">
<link rel="stylesheet" href="/css/AdminRegistration.css">
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


<div class="registration-container">
    <h2>Admin Registration</h2>
    <form class="registration-form" action="addadmin" method="post">
        <h3 style="color: green">${msg}</h3>
        <input type="text" name="admin_fullname" placeholder="Full Name" required>
        <input type="email" name="admin_email" placeholder="Email" required>
        <input type="text" name="admin_username" placeholder="Username" required>
        <input type="password" name="admin_password" placeholder="Password" required>
        <input type="password" name="confirm_password" placeholder="Confirm Password" required>
        <input type="text" name="admin_phone" placeholder="Phone Number" required>
        <input type="text" name="admin_address" placeholder="Address" required>
        <input type="submit" value="Register">
    </form>
</div>

</body>
</html>
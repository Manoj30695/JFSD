<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Emp_Navbar.css">
<link rel="stylesheet" href="/css/Emp_Contact.css">
</head>
<body>
<header>
    <h1>Student Panel - Student Management System</h1>
</header>

<nav>
    <ul>
        <li><a href="empdash">Dashboard</a></li>
        <li><a href="#">Courses</a></li>
        <li><a href="myleaves">My Leaves</a></li>
        <li><a href="LeaveApp">ApplyForLeave</a></li>
        <li><a href="empprofile">Profile</a></li>
        <li><a href="EmpLogin">Sign Out</a></li>
    </ul>
</nav>

<div class="container">
    <form action="#" method="post">
        <label for="name">Your Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Your Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="message">Message:</label>
        <textarea id="message" name="message" required></textarea>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
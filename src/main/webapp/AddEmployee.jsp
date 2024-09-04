<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Admin_Navbar.css">
<link rel="stylesheet" href="/css/AddEmployee.css">
</head>

<body>

<header>
    <h1>Admin Panel - Student Management System</h1>
</header>

<nav>
    <ul>
        <li><a href="admindash">Dashboard</a></li>
        <li><a href="addemp">Add Employee</a></li>
        <li><a href="#">Courses</a></li>
        <li><a href="#">Teachers</a></li>
        <li><a href="#">Grades</a></li>
        <li><a href="adminLeaveHis">Leave History</a></li>
        <li><a href="AdminLogin">Sign Out</a></li>
    </ul>
</nav>
<form action="addemployee" method="post">

    <h3 style="color: green">${msg}</h3>
    <label for="student_id">Emp ID:</label>
    <input type="text" id="student_id" name="student_id" required>
    
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email" required>

    <label for="dob">Date of Birth:</label>
    <input type="text" id="dob" name="dob" placeholder="YYYY-MM-DD" required>

    <label for="gender">Gender:</label>
    <select id="gender" name="gender" required>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
    </select>
    
    <label for="department">Department:</label>
    <input type="text" id="department" name="department" required>

    <label for="course">Course:</label>
    <input type="text" id="course" name="course" required>

    <label for="grade">Grade:</label>
    <input type="text" id="grade" name="grade" required>
    
    <label for="contact">Contact:</label>
    <input type="text" id="contact" name="contact" required>

    <input type="submit" value="Add 	Employee">
</form>

</body>
</html>
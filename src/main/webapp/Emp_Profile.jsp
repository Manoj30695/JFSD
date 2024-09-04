<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Emp_Navbar.css">
 <link rel="stylesheet" href="/css/Emp_Profile.css"> 
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
    <div class="profile-info">
        <label for="student_name">Name:</label>
        <p><span>${emppro.name}</span></p>
    </div>
    <div class="profile-info">
        <label for="student_id">Student ID:</label>
        <p><span>${emppro.id}</span></p>
    </div>
    <div class="profile-info">
        <label for="department">Department:</label>
        <p><span>${emppro.department}</span></p>
    </div>
    <div class="profile-info">
        <label for="email">Email:</label>
        <p><span>${emppro.email}</span></p>
    </div>
    <div class="profile-info">
        <label for="dob">Date of Birth:</label>
        <p><span>${emppro.dob}</span></p>
    </div>
    <div class="edit-profile-link">
        <a href="#">Edit Profile</a>
    </div>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Emp_Navbar.css">
<link rel="stylesheet" href="/css/Emp_Dashboard.css">
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
    <div class="card">
        <h2>Leave Requests</h2>
        <p>Manage and view your leave requests.</p>
        <a href="#">View Leave Requests</a>
    </div>
    <div class="card">
        <h2>Apply for Leave</h2>
        <p>Apply for a new leave request.</p>
        <a href="LeaveApp">Apply for Leave</a>
    </div>
    <div class="card">
        <h2>Leave History</h2>
        <p>View your leave history and past requests.</p>
        <a href="myleaves">View Leave History</a>
    </div>
    <div class="card">
        <h2>Upcoming Events</h2>
        <p>View upcoming events and important dates.</p>
        <a href="#">View Events</a>
    </div>
    <div class="card">
        <h2>Profile Settings</h2>
        <p>Manage your profile information and settings.</p>
        <a href="empprofile">Profile Settings</a>
    </div>
    <div class="card">
        <h2>Help & Support</h2>
        <p>Get assistance and support for any issues or inquiries.</p>
        <a href="empcontact">Contact Support</a>
    </div>
</div>

</body>
</html>
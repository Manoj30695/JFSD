<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Emp_Navbar.css">
<link rel="stylesheet" href="/css/LeaveApp.css">
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

<form action="applyleave" method="post">
<h3 style="color:green">${msg }</h3>
<h3 style="color:green">${appliedmes }</h3>
    <label for="student_name">Student Name:</label>
    <input type="text" id="student_name" name="student_name" required>

    <label for="student_id">Student ID:</label>
    <input type="text" id="student_id" name="student_id" required>

    <label for="department">Department:</label>
    <input type="text" id="department" name="department" required>

    <label for="leave_type">Leave Type:</label>
    <select id="leave_type" name="leave_type" required>
        <option value="vacation">Vacation</option>
        <option value="sick">Sick Leave</option>
        <option value="personal">Personal Leave</option>
        <!-- Add more options as needed -->
    </select>

    <label for="StartDate">Start Date:</label>
    <input type="date" id="StartDate" name="start_date" required>

    <label for="EndDate">End Date:</label>
    <input type="date" id="EndDate" name="end_date" required>

    <label for="reason">Reason:</label>
    <textarea id="reason" name="reason" rows="4" required></textarea>

    <input type="submit" value="Submit Leave Application">
</form>

</body>

    <script>
        // Get today's date
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
        var yyyy = today.getFullYear();

        today = yyyy + '-' + mm + '-' + dd;

        // Set the minimum date to today
        document.getElementById("StartDate").setAttribute("min", today);
    </script>
    
      <script>
        // Get today's date
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
        var yyyy = today.getFullYear();

        today = yyyy + '-' + mm + '-' + dd;

        // Set the minimum date to today
        document.getElementById("EndDate").setAttribute("min", today);
    </script>

</html>
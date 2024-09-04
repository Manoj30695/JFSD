<%@page import="jakarta.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Leave Management System</title>
<link rel="stylesheet" href="/css/Admin_Navbar.css">
<link rel="stylesheet" href="/css/Emp_Viewleaves.css">
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


<table>
    <thead>
        <tr>
                   <th>Employee ID</th>
                    <th>Leave Type</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Reason</th>
                    <th>Status</th>
        </tr>
    </thead>
    <tbody>
          <c:forEach items="${mylea}" var="l">
        <tr>
                    <td>${l.id}</td>
                    <td>${l.LType}</td>
                    <td>${l.sdate}</td>
                    <td>${l.edate}</td>
                    <td>${l.reason}</td>
                    <td>
                    ${l.applystatus}
                    </td>
        </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
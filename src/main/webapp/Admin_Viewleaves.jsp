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
<link rel="stylesheet" href="/css/Admin_Viewleaves.css">
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
<center><h2  style="color: blue;">${mess}</h2></center>
<table>
    <thead>
        <tr>
            <th>Student Name</th>
            <th>Student ID</th>
            <th>Department</th>
            <th>Leave Type</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Reason</th>
            <th>Status</th>
            <th>Action</th>
              <th>Action</th>
            
        </tr>
    </thead>
    <tbody>
        <!-- Sample data, replace with dynamic data from backend -->
        <c:forEach items="${list}" var="l">
                <tr>
                    <td>${l.name}</td>
                    <td>${l.id}</td>
                    <td>${l.department}</td>
                    <td>${l.LType}</td>
                    <td>${l.sdate}</td>
                    <td>${l.edate}</td>
                    <td>${l.reason}</td>
                    <td>
                        ${l.applystatus}
                    </td>
                    <td>
                        <a href='<c:url value="acceptorrejectleave?id=${l.id}&date=${l.sdate}&status=Accept" />'>
                            <button class="btn"><h3 style="color:green;">Accept</h3></button>
                        </a>
                    </td>
                    <td>
                        <a href='<c:url value="acceptorrejectleave?id=${l.id}&date=${l.sdate}&status=Reject" />'>
                            <button class="btnr"><h3 style="color: red;">Reject</h3></button>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        <!-- Add more rows as needed -->
    </tbody>
</table>
</body>
</html>
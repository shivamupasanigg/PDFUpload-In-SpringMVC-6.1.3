<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin / User login</title>
</head>
<body>
<h1>Admin Login page</h1>
<form:form action="login" method="post" modelAttribute="adminlogin">

UserName: <form:input path="Username" placeholder="username" autocomplete="off"/><br>
Password: <form:input path="Password" type="password" autocomplete="off" placeholder="password"/><br>
<input type="submit" value="Submit" />
</form:form>





<h1>User Registration page</h1>
<form:form action="UserRegister" method="post" modelAttribute="userregister">
FirstName : <form:input path="name" placeholder="enter first name" autocomplete="off" /><br>
UserName: <form:input path="username" placeholder="enter username" autocomplete="off" /><br>
Password: <form:input path="password" type="password" autocomplete="off" placeholder="enter password" /><br>

 <input type="submit" value="Submit" />
</form:form>



<h1>User Login page</h1>
<form:form action="userlogin" method="post" modelAttribute="Userlogin">

UserName: <form:input path="username" placeholder="enter username" autocomplete="off" /><br>
Password: <form:input path="password" type="password" autocomplete="off" placeholder="enter password" /><br>

 <input type="submit" value="Submit" />
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list of pdf names</h1>
<a href="adminDashboard">go back</a>
<br>
<br>
<br>
<table border="2">

<tr>
<td>id</td>
<td>names</td>
<td>update link</td>
<td>delete link</td>
</tr>
<c:forEach var="listpdfname" items="${listpdfname}">
<tr>
<td>${listpdfname.id}</td>
<td>${listpdfname.pdfname}</td>
<td><a href="edit?id=${listpdfname.id}">update</a></td>
<td><a href="delete?id=${listpdfname.id}">delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
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

<a href="logoutuser">logout</a>
<h1>User Panel section</h1>
<h1>pdf name list</h1>     
    <table border="2">
    <tr>
    <td>pdf id</td>
    <td>pdf name</td>
    <td>view Pdf</td>
    </tr>
    <c:forEach var="getpdf" items="${getpdf}">
    <tr>
    <td>${getpdf.id}</td>
    <td>${getpdf.pdfname}</td>
    <td><a href="ViewPdf?id=${getpdf.id}">View PDF</a></td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>
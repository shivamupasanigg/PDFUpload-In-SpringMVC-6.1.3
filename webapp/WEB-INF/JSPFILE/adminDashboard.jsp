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
<a href="logout" target="_self">logout</a>
<form action="register" method="post" enctype="multipart/form-data">

pdf name: <input type="text" name="pdfname" id="pdfname" placeholder="enter pdf name" autocomplete="off"/><br>
pdf : <input type="file" name="pdf" id="pdf"><br>

 <input type="submit" value="Submit" />
 <h1>${msg}</h1>
 <a href="getalldata">list of pdfs</a>
 </form>
</body>
</html>
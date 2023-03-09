<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload a file</h1>
	<form method="post" action="upload" enctype="multipart/form-data" >
	<h2>upload your photo : </h2>
	<input type="file" name="file" size="50">
	<input type="submit" value="save">
	</form>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>

<body>
	<form action="user.do">
		<input type ="text" name="name"/><br/>
		<input type="password" name="password"><br/>
			<input type=hidden name=method value=reg   />
		<input type="submit" value = "提交"> 
	</form>
</body>
</html>

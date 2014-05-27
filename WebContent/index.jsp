<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
</head>
<script type="text/javascript">
	$(function() {
		$('#send').click(
				function() {
					var password = $('#password').val();
					var name = $('#user').val();
					$.ajax({
						type : "get",
						url : "ajax.do",
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						data : {"password" :password ,"name" :name },
						dataType : 'text',
						success : function(data) {
							alert("上传中");
								$("#cid").append('<option >'+data+'</option>');
						}
					});
				});
	});
</script>

<body>
	<button id="send" ></button>
	<input id = "user" value="中文">
	<input id = "password" value="456">
	<input id = "cid" >
</body>
</html>

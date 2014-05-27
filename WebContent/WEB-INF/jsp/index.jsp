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
<script type="text/javascript">
	
</script>

</head>

<body>
	<div>
		<table border="1">
			<thead>
				<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				</tr>
			</thead>
			<tbody>
			<c:if test="${!empty userList }">
				<c:forEach items="${userList }" var="user">
					<tr>
						<td><input type="checkbox" /></td>
						<td>${user.name }</td>
						<td>${user.password }</td>
						<td><a href="/test_ssh/user/getUser?id=${user.id }">编辑</a> <a
							href="javascript:del('${user.id }')">删除</a></td>
					</tr>
				</c:forEach>
			</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>

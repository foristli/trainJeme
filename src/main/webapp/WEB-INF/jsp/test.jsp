<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>just for test the forward</p>
<s:form action="login" method="post">
	</br>
	<s:textfield name="user.name" label="User Name"></s:textfield>
	</br>
	<s:password name="user.password" label="Password"></s:password>
	</br>
	<s:submit value="subs"></s:submit>
	</br>
</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload file demo</title>
</head>
<body>
 <h1>welcome to uload file testing</h1>
 <s:form action="uploadForm" enctype="multipart/form-data" method="POST">
 	<s:file name="image" label="select file:">
 	
 	</s:file>
 	<s:submit label="sub"></s:submit>
 </s:form>
 
</body>
</html>
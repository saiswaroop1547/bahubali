<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Messages of the day</title>
</head>
<body bgcolor="white">
<h1>Message of the day</h1>
<jsp:useBean id="msg" class=""/>
<h2> Deep thoughts - by Jack Handey</h2>
<jsp:setProperty name="msg" property="category" value="thoughts"/>
<i>
<jsp:getProperty name="msg" property="message"/>
</i>
<h2>Quotes from the famous and the unknown</h2>
<jsp:setProperty property="category" name="msg" value="quotes"/>
<i>
<jsp:getProperty property="message" name="msg"/>
</i>
</body>
</html>
<%@ taglib prefix="var" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title></title>
    <style></style>
</head>
<body>
<h3>Spring REST demo</h3>
<hr>
<a href="${pageContext.request.contextPath}/hello">Hello</a>
<hr>
<a href="${pageContext.request.contextPath}/api/students">Students</a>
</body>
</html>
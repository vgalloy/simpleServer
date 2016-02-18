<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tag"%>

<!DOCTYPE html>
<html>
<head>
    <title>Simple Title</title>
</head>
<body>
    <c:out value="${value}"/>${value}
</body>
<footer>
    <tag:simpleTag myValue="${value}"/>
</footer>
</html>
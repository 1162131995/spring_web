<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
		<tr>
			<th width="10%">新闻编号</th>
			<th width="30%">新闻标题</th>
			<th>新闻内容</th>
		</tr>
		<c:forEach var="news" items="${requestScope.newsList }">
			<tr>
				<td>${pageScope.news.newsId }</td>
				<td>${pageScope.news.title }</td>
				<td>${pageScope.news.content }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
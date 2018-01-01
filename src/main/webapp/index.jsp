<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form action="${pageContext.request.contextPath }/addNews" method="post">
	标题：<input type="text" name="title"></br>
	内容：<textarea name="content" rows="20" cols="50"></textarea></br>
	<input type="submit">
	</form><br>
	<form action="${pageContext.request.contextPath }/NewsController" method="post">
	<input type="text" name="content"/>
	<input type="submit" value="查询">
	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${Creply}" var="Creply">
			<div>
			<form method="post">
				작성자
				<input type="text" name="writer" value="${Creply.writer}"></br>
				내용
				<textarea cols="50" rows="5" name="content">${Creply.content}</textarea>

					
						 <input type="hidden" name="bno" value="${view.bno}">
						<input type="hidden" name="rno" value="${Creply.rno}">
						<button type="submit">수정하기</button>
					</form>
				</div>
		
		
		</c:forEach>
</body>
</html>
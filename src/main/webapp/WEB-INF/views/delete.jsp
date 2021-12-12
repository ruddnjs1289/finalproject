<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>È¸¿øÅ»Åð</title>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/53a8c415f1.js"
	crossorigin="anonymous"></script>
<link href="./resources/css/login.css" rel="stylesheet" />
</head>
<body>
<form name="addjoin" role="form" method="post" autocomplete="off">
		<div class="wrap">
			<div class="login" style="height: 700px;">
				<h2>Join</h2>
				<div class="login_sns">
					<li><a href="main.do">home</i></a></li>
				</div>
				<div class="login_id">
					<h4>ID</h4>
					<input type="text" name="id" id="id" placeholder="ID">
				</div>
				<div></div>
				<div class="login_pw">
					<h4>Password</h4>
					<input type="text" name="pw" id="pw" placeholder="Password">
				</div>
				<div class="submit">
					<button type="submit"  id="submit" 
						style="width: 100%; height: 50px; border: 0; outline: none; border-radius: 40px; 
						background: linear-gradient(to left, rgb(255, 77, 46), rgb(255, 155, 47)); color: white; 
						font-size: 1.2em; letter-spacing: 2px;" >Å»ÅðÇÏ±â</button>
				</div>
			</div>
		</div>
	</form>
	
	<c:if test="${msg ==false}">
		<script type="text/javascript">
					alert('Å»Åð ½ÇÆÐ')
				</script>
	</c:if>
</body>
</html>
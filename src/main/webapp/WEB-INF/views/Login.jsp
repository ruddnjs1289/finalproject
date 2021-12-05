<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/53a8c415f1.js"
	crossorigin="anonymous"></script>
<link href="./resources/css/login.css" rel="stylesheet" />
</head>
<body>
<form role="form" method="post" action="/Login">
	<div class="wrap">
		<div class="login">
			<h2>Log-in</h2>
			<div class="login_sns">
				<li><a href="main.do">home</i></a></li>
			</div>
			<div class="login_id">
				<h4>E-mail</h4>
				<input type="email" name="" id="" placeholder="Email">
			</div>
			<div class="login_pw">
				<h4>Password</h4>
				<input type="password" name="" id="" placeholder="Password">
			</div>
			<div class="login_etc">
				<a href="Join.do">회원가입</a>
				<div class="forgot_pw">
					<a href="">비밀번호를 잃어버리셨나요?</a>
				</div>
			</div>
			<div class="submit">
				<button type="button" id="submit"
					style="width: 100%; height: 50px; border: 0; outline: none; border-radius: 40px; background: linear-gradient(to left, rgb(255, 77, 46), rgb(255, 155, 47)); color: white; font-size: 1.2em; letter-spacing: 2px;">
					로그인</button>
			</div>
		</div>
	</div>
	
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메인페이지</title>
<link href="./resources/css/main.css" rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div class="main-container">
		<div class="temp-box">
			<a href="main.do"><img src="./resources/img/Logo.png"></a>
		</div>
		<div class="temp-box">
			<!-- <a href=Login.do>
			<img
				src="https://cdn1.iconfinder.com/data/icons/materia-arrows-symbols-vol-8/24/018_319_door_enter_login_signin-128.png">
			</a> -->
        <form role="form" method="post" autocomplete="off" action="login">
			<c:if test="${member == null}">
			<p>
				아이디:<input type="text" name="id"  style="width: 50%">
			</p>
			<p>
				비밀번호:<input type="text" name="pw"  style="width: 50%">
			</p>
			</c:if>
			
			<c:if test="${member !=null}">
				<p>${member.id}님 환영합니다.</p>
				<a href="logout.do">로그아웃</a> <a href="delete.do">회원탈퇴</a>
			</c:if>
			
			<c:if test="${msg==false}">
				<script type="text/javascript">
					alert('로그인 실패')
				</script>
			</c:if>
			
			<c:if test="${member == null}">
			<!--나중에 type 패스워드로 바꾸기  -->
			<div
				style="width: 164px; height: 45px; border: 1px solid red; float: left;"><button type="submit" id="Login">로그인</button></div>
			<div
				style="width: 164px; height: 45px; border: 1px solid green; float: left;">
				<button type="button" name="JoinID" onclick="location.href='Join.do'">회원가입</button></div>
			</c:if>
		</form>

				
				
				
				
		
		</div>
		<div class="temp-box">
			레이드 구인 구직
			<div id="demo" class="carousel slide" data-bs-ride="carousel">

				<!-- Indicators/dots -->
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#demo" data-bs-slide-to="0"
						class="active"></button>
					<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
					<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
				</div>

				<!-- The slideshow/carousel -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="./resources/img/Valtan.jpg" alt="Los Angeles"
							class="d-block w-100" style="height: 500px;">
					</div>
					<div class="carousel-item">
						<img src="./resources/img/Biackiss.jpg" alt="Chicago"
							class="d-block w-100" style="height: 500px;">
					</div>
					<div class="carousel-item">
						<img src="./resources/img/Kouku.jpg" alt="New York"
							class="d-block w-100" style="height: 500px;">
					</div>
				</div>

				<!-- Left and right controls/icons -->
				<button class="carousel-control-prev" type="button"
					data-bs-target="#demo" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#demo" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>
			</div>
		</div>

		<div class="temp-box">
			<p style="font-size: 30px;">공략 게시판</p>

			<div style="text-align: left; font-size: 25px;">
				<ul>
					<li>발탄 공략</li>
					<ul>
						<li><a href="Valtan1.do">1네임드</a></li>
						<li><a href="Valtan1.do">2네임드</a></li>
					</ul>
				</ul>

				<ul>
					<li>비아키스</li>
					<ul>
						<li><a href="Biackiss1.do">1네임드</a></li>
						<li><a href="Biackiss2.do">2네임드</a></li>
						<li><a href="Biackiss3.do">3네임드</a></li>
					</ul>
				</ul>
				<ul>
					<li>쿠크세이튼</li>
					<ul>
						<li><a href="Kouku1.do"> 1네임드</a></li>
						<li><a href="Kouku1.do"> 2네임드</a></li>
						<li><a href="Kouku1.do"> 3네임드</a></li>
					</ul>
				</ul>
			</div>

		</div>

		<div class="temp-box">
			시뮬<br> <a href="Stone.do">돌 시뮬</a> <a href="Bingo">빙고</a> <a
				href="Pattern">아재패턴</a>

		


		</div>
		<div class="temp-box">
			<p style="font-size: 25px;">길드 홍보 게시판</p>
			<div style="font-size: 25px;">
				<li><a href="Carmine?num=1">카마인</a></li>
				<li><a href="Loopaeon.do">루페온</a></li>
				<li><a href="Ninave.do">니나브</a></li>
			</div>
			<p style="font-size: 25px;">자유게시판</p>
			
		</div>
		<div class="temp-box3">밑에 아무거나</div>
	</div>
</form>
</body>
</html>
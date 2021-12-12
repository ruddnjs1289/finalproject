<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
<link href="./resources/css/attack.css" rel="stylesheet" />
</head>
<body>
	<div class="main-container">
		<div class="temp-box">
			<form method="post">
				<a href="main.do"><img src="./resources/img/Logo.png"></a>

			</form>
		</div>
		<div class="temp-box">
			<c:if test="${member == null}">
			<a href="main.do">로그인하러가기</a>
			</c:if>
			
			<c:if test="${member !=null}">
			<p style="font-size:30px;">${member.id}님 환영합니다.</p>
			<a href="logout.do">로그아웃</a>
			</c:if>
		</div>

		<div class="temp-box">
			<form method="post">
				<label style="font-size: 30px;">제목 :</label><input type="text" name="title" style="width: 70%; height: 30px; margin: auto;" /><br /> 
				<label>작성자:</label><input type="text" name="writer" value="${member.id}"style=" height: 30px; margin: auto;" readonly="readonly"/></br>
				
				
				<label>내용</label></br>
				<textarea cols="50" wrap="soft" rows="5" name="content" style="margin: 0px; width: 707px; height: 310px;"></textarea>
				
				<br/>

				<button type="submit">작성</button>

			</form>
		</div>


		<div class="temp-box2">
			<p style="text-align: center;">공략 게시판</p>
			<ul>
				<li>발탄</li>
				<ul>
					<li><a href="Valtan1.do">1네임드</a></li>
					<li><a href="Valtan2.do">2네임드</a></li>
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
					<li><a href="Kouku2.do"> 2네임드</a></li>
					<li><a href="Kouku3.do"> 3네임드</a></li>
				</ul>
			</ul>
			<p style="text-align: center;">자유게시판</p>
			<p style="text-align: center;">길드 홍보 게시판</p>
			<li><a href="Carmine?num=1">카마인</a></li>
			<li><a href="Loopaeon.do">루페온</a></li>
			<li><a href="Ninave.do">니나브</a></li> 시뮬<br>
			<li><a href="Stone.do">돌시뮬</a></li>
			<li><a href="Bingo">빙고</a></li>
			<li><a href="Pattern">아재패턴</a>
		</div>
		<div class="temp-box3">밑에 아무거나</div>
	</div>
</body>
</html>




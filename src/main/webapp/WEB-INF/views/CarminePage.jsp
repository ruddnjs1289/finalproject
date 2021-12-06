<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쿠크공략게시판</title>
<link href="./resources/css/attack.css" rel="stylesheet" />
</head>
<body>
	<div class="main-container">
		<div class="temp-box">
			<img src="./resources/img/Logo.png">
		</div>
		<div class="temp-box">
			<a href=Login.do> <img
				src="https://cdn1.iconfinder.com/data/icons/materia-arrows-symbols-vol-8/24/018_319_door_enter_login_signin-128.png">
			</a>
		</div>
		
		<div class="temp-box">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성일</th>
					<th>작성자</th>
					<th>조회수 </th>
				</tr>
				<tbody>
					<c:forEach items="${list}" var="list"> 
					 	<tr>
					 		<td>${list.bno}</td>
					 		<td>
					 		<a href="View?bno=${list.bno}">${list.title}</a>
					 		</td>
					 		<td>
					 		<fmt:formatDate value="${list.regDate}" pattern="yyyy-MM-dd" />
					 		</td>
					 		<td>${list.writer}</td>
					 		<td>${list.viewCnt}</td>
					 	</tr>
					</c:forEach>
				</tbody>
			</thead>
			
		</table>
		<div style="text-align: right;"><a href="Write.do">글작성하기</a></div>
		
		<div>
			<c:forEach begin="1" end="${pageNum}" var="num">
				<span>
					<a href="CarminePage?num=${num}">${num}</a>
				</span>
			</c:forEach> 
		</div>
		</div>
		
		
		<div class="temp-box2">
			          <p style="text-align: center;">공략 게시판</p>
		 <ul>
			<li>발탄 </li>
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
			<li><a href="Carmine.do">카마인</a></li>
			<li><a href="Loopaeon.do">루페온</a></li>
			<li><a href="Ninave.do">니나브</a></li> 
			시뮬<br> 
			<li><a href="Stone.do">돌시뮬</a></li>
			<li><a href="Bingo">빙고</a></li>
			<li><a href="Pattern">아재패턴</a>
		     </div>
		<div class="temp-box3">밑에 아무거나</div>
	</div>
</body>
</html>
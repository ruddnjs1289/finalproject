<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>
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
	<label>제목</label>
	<input type="text" name="title" value="${view.title}" readonly="readonly" style="width: 70%; height: 30px; margin: auto;"/>
	<br />

	<label>작성자</label>
	<input type="text" name="writer" value="${view.writer}" readonly="readonly" />
	<br />

	<label>내용</label>
	<textarea cols="50" rows="5" name="content" readonly="readonly" style="margin: 0px; width: 707px; height: 310px;">${view.content}</textarea>
	<br />

	<!-- <button type="submit">작성</button> -->

	</form>
	<div>
	<c:if test="${member.id == view.writer}">
		<a href="Modify?bno=${view.bno}">게시물 수정</a> , <a href="Delete?bno=${view.bno}">게시물 삭제</a>
	</c:if>
	
	
	</div>
	<!-- 댓글 -->
		<hr />

	<ul>
		<c:forEach items="${Creply}" var="Creply">
		<li>
			<div>
				<%-- 	<form method="get" action="reply/Replymodify?bno=${view.bno}&rno=${Creply.rno}">
						<input type="hidden" name="bno" value="${view.bno}">
						<input type="hidden" name="rno" value="${Creply.rno}">
						<button type="submit">수정하기</button>
					</form> --%>
					
				<!--수정 -->	
			<form method="post" action="reply/Replymodify?bno=${view.bno}&rno=${Creply.rno}">
				<p>작성자:<input type="text" name="writer" value="${Creply.writer}" readonly="readonly"> 작성시간:<fmt:formatDate value="${Creply.regDate}" pattern="yyyy-MM-dd"/></p>
				<c:if test="${member == null}">
					<p>작성 내용:${Creply.content}</p>
				</c:if>
				
				<c:if test="${member.id == Creply.writer}">
					<p>작성 내용:<input type="text" name="content" value="${Creply.content}"></p>
				</c:if>
				
				<c:if test="${member.id != Creply.writer}">
					<p>작성 내용:<input type="text" name="content" value="${Creply.content}" readonly="readonly"></p>
				</c:if>
						<input type="hidden" name="bno" value="${view.bno}"><%-- bno ${view.bno} --%>
						<input type="hidden" name="rno" value="${Creply.rno}"><%-- rno ${Creply.rno} --%>
				<c:if test="${member.id == Creply.writer}">
						<button type="submit" style="float: right;">수정하기</button>
				</c:if>
			</form>
				<!--삭제  -->
					<form method="post" action="reply/delete">
						<p><input type="hidden" name="bno" value="${view.bno}"></p>
						<input type="hidden" name="rno" value="${Creply.rno}">
					<c:if test="${member.id == Creply.writer}">
						<button type="submit" style="float: right;">삭제하기</button>
					</c:if>
					</form>
					</br>
					<hr>
				</div>	
		</li>
		</c:forEach>	
	</ul>
	

	<div>
		<c:if test="${member != null}">
				<form method="post" action="reply/write">
					<p>
						<label>댓글 작성자</label> 
						<input type="text" name="writer" value="${member.id}">
					</p>
					<p>
						<textarea rows="5" cols="50" name="content"></textarea>
					</p>
					<p>
						<input type="hidden" name="bno" value="${view.bno}">
						<button type="submit">댓글 작성</button>
					</p>
				</form>
		</c:if>
	</div> 
	
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



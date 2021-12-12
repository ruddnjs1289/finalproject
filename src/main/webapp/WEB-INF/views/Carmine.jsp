<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


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
			<a href="main.do"><img src="./resources/img/Logo.png"></a>
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
			<table>
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>작성자</th>
						<th>조회수</th>
					</tr>
				<tbody>
					<c:forEach items="${list}" var="list">
						<tr>
							<td>${list.bno}</td>
							<td><a href="View?bno=${list.bno}">${list.title}</a></td>
							<td><fmt:formatDate value="${list.regDate}"
									pattern="yyyy-MM-dd" /></td>
							<td>${list.writer}</td>
							<td>${list.viewCnt}</td>
						</tr>
					</c:forEach>
				</tbody>
				</thead>

			</table>
			<div style="text-align: right;">
			
			
				
				<button type="button" id="ok">작성하기</button>
			

			</div>
			<div>
				<%-- <c:forEach begin="1" end="${pageNum}" var="num">
				<span>
					<a href="Carmine?num=${num}">${num}</a>
				</span>
			</c:forEach>  --%>
				<c:if test="${page.prev}">
					<span>[ <a href="Carmine?num=${page.startPageNum - 1}${page.searchTypeKeyword}">이전</a> ]
					</span>
				</c:if>

				<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}" var="num">
					<span> <c:if test="${select !=num}">
							<a href="Carmine?num=${num}${page.searchTypeKeyword}">${num}</a>
						</c:if> <c:if test="${select == num}">
							<b>${num}</b>
						</c:if>
					</span>
				</c:forEach>

				<c:if test="${page.next}">
					<span>[ <a href="Carmine?num=${page.endPageNum + 1}${page.searchTypeKeyword}">다음</a> ]
					</span>
				</c:if>
			</div>
			<div>
				<select name="searchType">
					<option value="title" <c:if test="${page.searchType eq 'title'}">selected</c:if>>제목</option>
					<option value="content" <c:if test="${page.searchType eq 'content'}">selected</c:if>>내용</option>
					<option value="title_content" <c:if test="${page.searchType eq 'title_content'}">selected</c:if>>제목+내용</option>
					<option value="writer" <c:if test="${page.searchType eq 'writer'}">selected</c:if>>작성자</option>
				</select> 

				<input type="text" name="keyword" value="${page.keyword}">
				<button type="button" id="searchBtn">검색</button>
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
	
		<script type="text/javascript">
				document.getElementById("searchBtn").onclick = function(){
					let searchType =document.getElementsByName("searchType")[0].value;
					let keyword = document.getElementsByName("keyword")[0].value;
					
					console.log(searchType)
					console.log(keyword)
					location.href ="Carmine?num=1"+ "&searchType=" + searchType + "&keyword=" + keyword;
				};
				
				document.getElementById("ok").onclick=function(){
					if (${member == null}) {
						alert("로그인을 해주세요")
						window.location.href='main.do';
					}else {
						window.location.href='Write.do';
					}
				}
				
		</script>
</body>
</html>
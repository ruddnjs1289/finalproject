<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�۾���</title>
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
			<a href="main.do">�α����Ϸ�����</a>
			</c:if>
			
			<c:if test="${member !=null}">
			<p style="font-size:30px;">${member.id}�� ȯ���մϴ�.</p>
			<a href="logout.do">�α׾ƿ�</a>
			</c:if>
		</div>

		<div class="temp-box">
			<form method="post">
				<label style="font-size: 30px;">���� :</label><input type="text" name="title" style="width: 70%; height: 30px; margin: auto;" /><br /> 
				<label>�ۼ���:</label><input type="text" name="writer" value="${member.id}"style=" height: 30px; margin: auto;" readonly="readonly"/></br>
				
				
				<label>����</label></br>
				<textarea cols="50" wrap="soft" rows="5" name="content" style="margin: 0px; width: 707px; height: 310px;"></textarea>
				
				<br/>

				<button type="submit">�ۼ�</button>

			</form>
		</div>


		<div class="temp-box2">
			<p style="text-align: center;">���� �Խ���</p>
			<ul>
				<li>��ź</li>
				<ul>
					<li><a href="Valtan1.do">1���ӵ�</a></li>
					<li><a href="Valtan2.do">2���ӵ�</a></li>
				</ul>
			</ul>
			<ul>
				<li>���Ű��</li>
				<ul>
					<li><a href="Biackiss1.do">1���ӵ�</a></li>
					<li><a href="Biackiss2.do">2���ӵ�</a></li>
					<li><a href="Biackiss3.do">3���ӵ�</a></li>
				</ul>
			</ul>

			<ul>
				<li>��ũ����ư</li>
				<ul>
					<li><a href="Kouku1.do"> 1���ӵ�</a></li>
					<li><a href="Kouku2.do"> 2���ӵ�</a></li>
					<li><a href="Kouku3.do"> 3���ӵ�</a></li>
				</ul>
			</ul>
			<p style="text-align: center;">�����Խ���</p>
			<p style="text-align: center;">��� ȫ�� �Խ���</p>
			<li><a href="Carmine?num=1">ī����</a></li>
			<li><a href="Loopaeon.do">�����</a></li>
			<li><a href="Ninave.do">�ϳ���</a></li> �ù�<br>
			<li><a href="Stone.do">���ù�</a></li>
			<li><a href="Bingo">����</a></li>
			<li><a href="Pattern">��������</a>
		</div>
		<div class="temp-box3">�ؿ� �ƹ��ų�</div>
	</div>
</body>
</html>




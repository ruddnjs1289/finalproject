<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����������</title>
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
			<img src="./resources/img/Logo.png">
		</div>
		<div class="temp-box">
		<a href=Login.do>
			<img
				src="https://cdn1.iconfinder.com/data/icons/materia-arrows-symbols-vol-8/24/018_319_door_enter_login_signin-128.png">
			</a>
		</div>
		<div class="temp-box">
			���̵� ���� ����
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
						<img src="./resources/img/slide01.jpg" alt="Los Angeles"
							class="d-block w-100">
					</div>
					<div class="carousel-item">
						<img src="./resources/img/slide02.jpg" alt="Chicago"
							class="d-block w-100">
					</div>
					<div class="carousel-item">
						<img src="./resources/img/slide03.jpg" alt="New York"
							class="d-block w-100">
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
			     <p style="font-size:30px;">���� �Խ���</p>
			 
	  <div style="text-align: left; font-size: 30px;">    
		<ul>
			<li>��ź ����</li>
				<ul>
					<li>1���ӵ�</li>
					<li>2���ӵ�</li>
				</ul>
		</ul>
		
		<ul>
			<li>���Ű��</li>
				<ul>
					<li>1���ӵ�</li>
					<li>2���ӵ�</li>
					<li>3���ӵ�</li>
				</ul>
		</ul>
		<ul>
				<li>��ũ����ư</li> 
					<ul>
						<li><a href="Kouku1.do"> 1���ӵ�</a></li>
						<li><a href="Kouku1.do"> 2���ӵ�</a></li>
						<li><a href="Kouku1.do"> 3���ӵ�</a></li>
					</ul>
			</ul>
	  </div>
			
		</div>

		<div class="temp-box">�ù�<br>
		<a href="Stone.do">�� �ù�</a>
		<a href="Bingo">����</a>
		<a href="Pattern">��������</a>
		</div>
		<div class="temp-box">
			<p style="font-size: 30px;"> ��� ȫ�� �Խ���</p>
			<div style="font-size: 25px;">
				<li><a href="Carmine.do">ī����</a></li>
				<li><a href="Loopaeon.do">�����</a></li>
				<li><a href="Ninave.do">�ϳ���</a></li>
			</div>
			<p style="font-size: 30px;"> �����Խ���</p>
			
		</div>
		<div class="temp-box3">�ؿ� �ƹ��ų�</div>
	</div>

</body>
</html>
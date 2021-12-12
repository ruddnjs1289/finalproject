<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>

<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/53a8c415f1.js" crossorigin="anonymous"></script>
<link href="./resources/css/login.css" rel="stylesheet" />
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>

	<form name="addjoin" role="form" method="post" autocomplete="off">
		<div class="wrap">
			<div class="login" style="height: 700px;">
				<h2>Join</h2>
				<div class="login_sns">
					<li><a href="Main.do">home</i></a></li>
				</div>
				<div class="login_id">
					<h4>ID</h4>
					<input type="text" name="id" id="id" placeholder="ID">
					<button type="button" class="idCheck">���̵�Ȯ��</button>
					<p class="result">
					<span class="msg">���̵� Ȯ��</span>
					</p>  
				</div>
				<div></div>
				<div class="login_pw">
					<h4>Password</h4>
					<input type="text" name="pw" id="pw" placeholder="Password">
				</div>
				<div class="login_pw">
					<h4>name</h4>
					<input type="text" name="name" id="name" placeholder="Password">
				</div>

				<div class="login_id">
					<h4>Email</h4>
					<input type="text" name="email" id="email" placeholder="Email">
				</div>
				<div class="login_etc">
					<div class="forgot_pw"></div>
				</div>
				<div class="submit">
					<button type="submit"  id="submit"  onclick="checkfield()"
						style="width: 100%; height: 50px; border: 0; outline: none; border-radius: 40px; 
						background: linear-gradient(to left, rgb(255, 77, 46), rgb(255, 155, 47)); color: white; 
						font-size: 1.2em; letter-spacing: 2px;" disabled="disabled">�����ϱ�</button>
				</div>
			</div>
		</div>
	</form>

	 <script type="text/javascript">
	 	/*  function checkfield() {

			if (document.addjoin.id.value == "") {
				alert("���̵� �Է��ϼ���");
				document.addjoin.id.focus();
				
			} else if (document.addjoin.pw.value == "") {
				alert("��й�ȣ�� �Է��ϼ���");
				document.addjoin.pw.focus();
				
			} else if (document.addjoin.name.value == "") {
				alert("�̸��� �Է��ϼ���");
				document.addjoin.name.focus();
				
			} else if (document.addjoin.email.value == "") {
				alert("�̸����� �Է��ϼ���");
				document.addjoin.email.focus();
				
			}
		}  */  
		
	$(".idCheck").click(function() {
			
		var query = {id : $("#id").val()};

			$.ajax({
				url : 'idCheck',
				type : 'post',
				data : query,
				success : function (data) {
					if (data == 1) {
						alert("�ߺ��� ���̵��Դϴ�.");
						$("#submit").attr("disabled","disabled");
					} else {
						alert("��밡�� ���̵��Դϴ�.");
						$("#submit").removeAttr("disabled","disabled");
					}
				},
				   error : function(XMLHttpRequest, textStatus, errorThrown){ // �񵿱� ����� �����Ұ�� error �ݹ����� ���ɴϴ�.
	                    alert("��� ����.")
	                }
			
			})

		}) 
		</script>
</body>
</html>
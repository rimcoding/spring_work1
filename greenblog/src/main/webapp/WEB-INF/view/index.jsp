<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
}

.blog {
	width: 1000px;
}

header {
	width: 1000px;
	border: 2px solid #ccc;
	height: 80px;
	border-radius: 3px;
	margin-bottom: 20px;
	background-image: url("image/banner.png");
}

.list {
	margin-left: 20px;
	border: 2px solid #ccc;
	border-radius: 10px;
	padding: 5px;
	font-size: 12px;
	height: 230px;
}

.header_text {
	padding-left: 10px;
}

.list ul {
	list-style: none;
	padding-left: 5px;
	width: 170px;
	height: 300px;
}

.list ul li {
	list-style: none;
}

.image1 {
	width: 20px;
	margin-bottom: 5px;
}

.image2 {
	margin-left: 80px;
	width: 25px;
}

.container {
	display: flex;
	flex-direction: row;
}

section {
	margin-left: 20px;
	margin-right: 20px;
}

.image-container {
	display: flex;
	flex-wrap: wrap;
}

.imagephoto {
	width: 150px;
	height: 150px;
}

nav {
	height: 300px;
	width: 170px;
}

.image-container2 {
	width: 150px;
	margin: 15px;
	font-size: 15px;
	margin: 15px;
}

.textbox {
	height: 50px;
	padding: 10px;
	font-size: 13px;
}

.datebox {
	padding: 10px;
	height: 20px;
	color: #ccc;
	font-weight: bold;
	font-size: 13px;
}

.pageNumber {
	display: flex;
	justify-content: center;
	align-items: center;
}

.pageNumber ul {
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-items: center;
	margin-left: 70px;
}

.pageNumber ul li {
	list-style: none;
	margin-right: 30px;
}

.container_text {
	display: flex;
	margin-left: 30px;
	font-weight: bold;
}

.container_text2 {
	color: aqua;
}

.writephoto {
	margin-left: 550px; margin-top : 15px;
	width: 25px;
	height: 25px;
	margin-top: 15px;
}

.alltext {
	margin-top: 0px; font-size : 13px;
	font-weight: bold;
	font-size: 13px;
}
.list li a{
 text-decoration: none;
 color: #ccc;
}
.list li a:hover{
color: black;
}
.headers {
	display: flex;
}

.camera {
	margin-top: 25px;
	margin-left: 650px;
}
.pageNumber ul li a{
	text-decoration: none;
	color: black;
	font-weight: bold;
}
.pageNumber ul li a:hover{
	color: aqua;
}
.textbox a{
text-decoration: none;
color: black;
}
</style>
</head>
<body>
	<div class="blog">
		<header>
			<div class="headers">
				<h1 class=header_text>
					Green's Blog<a href="#"><img alt="" src="/image/1.png" class="image1"></a>
				</h1>
				<div class="camera">
					<a href="https://www.instagram.com/"><img alt="" src="image/4.png" width="26px" height="26px" style="margin-bottom: 3px"></a> <a href="https://www.youtube.com/"><img alt="" src="image/5.png" width="30px" height="30px"></a>
				</div>
			</div>
		</header>
		<div class="container">
			<nav class=list>
				<ul>
					<li class="alltext"><a href="#">전체보기</a><a href="#"><img alt="" src="/image/1.png" class="image2"></a></li>
					<li>&nbsp</li>
					<li><a href="#">Python(12)</a></li>
					<li><a href="#">Java(2)</a></li>
					<li><a href="#">Ios(8)</a></li>
					<li><a href="#">소프트웨어 자료(26)</a></li>
					<li><a href="#">자료구조(8)</a></li>
					<li><a href="#">리눅스(8)</a></li>
					<li><a href="#">Git(4)</a></li>
					<li><a href="#">자기계발(3)</a></li>
					<li><a href="#">경영전략(20)</a></li>
					<li><a href="#">리더쉽(7)</a></li>
				</ul>
			</nav>
			<section>
				<div class="container_text">
					<p>경영 전략&nbsp</p>
					<p class="container_text2">20</p>
					<a href="#"><img alt="" src="/image/3.png" class="writephoto"></a>
				</div>

				<div class="image-container">
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</a></p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">불황 속에서도 기업 성장 피하는 전략</a></p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">CSV 실행, 전략적으로 접근이 필요하다</a></p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</a></p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</a></p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">불황 속에서도 기업 성장 피하는 전략</a></p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">CSV 실행, 전략적으로 접근이 필요하다</a></p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</a></p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</a></p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">불황 속에서도 기업 성장 피하는 전략</a></p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">CSV 실행, 전략적으로 접근이 필요하다</a></p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</a></p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</a></p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">불황 속에서도 기업 성장 피하는 전략</a></p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">CSV 실행, 전략적으로 접근이 필요하다</a></p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<a href="#"><img alt="" src="/image/2.png" class="imagephoto"></a>
						<p class="textbox"><a href="#">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</a></p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					

					<div class="pageNumber">
						<ul>
							<li><a href="#"><&nbsp이전</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">6</a></li>
							<li><a href="#">7</a></li>
							<li><a href="#">8</a></li>
							<li><a href="#">9</a></li>
							<li><a href="#">10</a></li>
							<li><a href="#">다음&nbsp></a></li>
						</ul>
					</div>
				</div>
			</section>
		</div>
	</div>
</body>
</html>
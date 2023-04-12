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
	height: 80px;
	padding: 10px;
	font-size: 13px;
}

.datebox {
	height: 20px;
	color: #ccc;
	font-weight: bold;
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
</style>
</head>
<body>
	<div class="blog">
		<header>
			<div class="headers">
				<h1 class=header_text>
					Green's Blog<img alt="" src="/image/1.png" class="image1">
				</h1>
				<div class="camera">
					<img alt="" src="image/4.png" width="26px" height="26px" style="margin-bottom: 3px"> <img alt="" src="image/5.png" width="30px" height="30px">
				</div>
			</div>
		</header>
		<div class="container">
			<nav class=list>
				<ul>
					<li class="alltext"><a href="#">전체보기</a><img alt="" src="/image/1.png" class="image2"></li>
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
					<img alt="" src="/image/3.png" class="writephoto">
				</div>

				<div class="image-container">
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">불황 속에서도 기업 성장 피하는 전략</p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">CSV 실행, 전략적으로 접근이 필요하다</p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">불황 속에서도 기업 성장 피하는 전략</p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">CSV 실행, 전략적으로 접근이 필요하다</p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">불황 속에서도 기업 성장 피하는 전략</p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">CSV 실행, 전략적으로 접근이 필요하다</p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</p>
						<p class="datebox">2022. 12. 2</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">랜덤 확보에 성공한 4세대 걸그룹의 차별화 전략</p>
						<p class="datebox">2022. 12. 30</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">불황 속에서도 기업 성장 피하는 전략</p>
						<p class="datebox">2022. 12. 8</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">CSV 실행, 전략적으로 접근이 필요하다</p>
						<p class="datebox">2022. 12. 7</p>
					</div>
					<div class="image-container2">
						<img alt="" src="/image/2.png" class="imagephoto">
						<p class="textbox">뉴노멀 시대 사무실,작은 변화로 극대화하는 방법의 새로운 방법을 논한다</p>
						<p class="datebox">2022. 12. 2</p>
					</div>

					<div class="pageNumber">
						<ul>
							<li><&nbsp이전</li>
							<li>1</li>
							<li>2</li>
							<li>3</li>
							<li>4</li>
							<li>5</li>
							<li>6</li>
							<li>7</li>
							<li>8</li>
							<li>9</li>
							<li>10</li>
							<li>다음&nbsp></li>
						</ul>
					</div>
				</div>
			</section>
		</div>
	</div>
</body>
</html>
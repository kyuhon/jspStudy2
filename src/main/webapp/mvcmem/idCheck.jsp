<%@page contentType="text/html; charset=UTF-8"%>
<!-- 3.화면설계(자바코드에 해야되는데 - > jsp service함수에서 진행한다. -->
<html>
<head>
<title>ID중복체크</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js?timestamp=<%= System.currentTimeMillis() %>"></script>
</head>
<body>
	<br>
	<main>
	
<%
		String id = (String)request.getAttribute("id");
		Boolean check = (Boolean)request.getAttribute("check");
		if (check == true) {
			out.println(id+"는 이미 존재하는 ID입니다.<br></br>");
		} else {
			out.println(id+"는 사용 가능 합니다.<br></br>");
		}
%>
	</main>
	 <hr>
	<button onClick="javascript:self.close()">닫기</button>
</body>
</html>
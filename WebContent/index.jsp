<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="javax.servlet.*,login.*" %>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #66ccff;">
<%
	HttpSession s1= request.getSession();
	LoginInfo login = (LoginInfo)request.getAttribute("logininfo");
	if(login != null){
		if(login.getLoginNum() == 1){
			//response.sendRedirect("");
		}else{
			//response.sendRedirect("");
		}
	}else{%>
	<div class="row">
 		 <div class="col-md-12" style="font-size:32px;color:#996633;margin-top: 2%;">欢迎来到滴滴租车网</div>
 	</div>
 	
 	<div class="jumbotron">
  <h1>滴滴租车网</h1>
  <p>欢迎光临滴滴租车网，我们以多年的经营信誉，赢得广大人民的好评，这里有最全的车辆，最低的价格，包您满意，快来租赁吧！</p>
  <p><button class="btn btn-primary btn-lg"  type="submit" name="Submit" value="login">我还没有账号，我要注册！</button></p>
   <p><button class="btn btn-primary btn-lg" type="submit" name="Submit" value="register">我已经有账号，我要登陆！</button></p>
</div>
<div class="row" style="background-color: #9932cd;margin-top:2%;font-size:24px">
  <div class="col-md-8">&nbsp;</div>
  <div class="col-md-4">本站作者：BLF2</div>
  <div class="col-md-8">&nbsp;</div>
  <div class="col-md-4">联系邮箱：blf20822@126.com</div>
</div>
	<%}
%>
</body>
</html>
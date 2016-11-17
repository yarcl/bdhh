<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">

    <link rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
    	function changeImg(){
    		document.getElementById("img").src="../ImageCode.do?time="+new Date();
    	}
    	/*用来验证用户名的js代码*/
    	var flagName = false;
    	function checkName(obj){
    		flagName = false;
    		if(obj.value==null||obj.value==""){
    			obj.value = "请输入6-20位的用户名！";
    			obj.style.color = "red";
    		} else if(obj.value.length<6||obj.value.length>20||obj.value == "请输入6-20位的用户名！") {
    			obj.style.color = "red";
    		} else {
    			obj.style.color = "";
    			flagName = true;
    			
    		}
    	}
    	
    	function clearName(obj){
    		if(obj.value=="请输入用户名"||obj.value=="请输入6-20位的用户名！"){
    			flagName = false;
    			obj.value = "";
    		}
    	}
    	/*用来验证用户名的js代码*/
    	
    	/*用来验证密码的js代码*/
    	var flagPwd = false;
    	function checkPwd(obj){
    		flagPwd = false;
    		if(obj.value==null||obj.value==""){
    			obj.value = "请输入正确格式的密码！";
    			obj.style.color = "red";
    		} else if(obj.value.length<6||obj.value.length>20||obj.value == "请输入正确格式的密码！"){
    			obj.style.color = "red";
    		} else {
    			obj.style.color = "";
    			flagPwd = true;
    		}
    	}
    	
    	function clearPwd(obj){
    		if(obj.value=="请输入密码"||obj.value=="请输入正确格式的密码！"){
    			flagPwd = false;
    			obj.value = "";
    		}
    	}
    	
    	/*用来验证密码的js代码*/
    	
    	/*用来验证所有的js代码*/
    	function ckAll(code) {
    		if(flagName==true&&flagPwd==true){
    			return true;
    		} 
    	}
    	/*用来验证所有的js代码*/
    	
    </script>
	<title>后台登陆</title>
</head>
<body>
	<div id="login_top">
		<div id="welcome">
			欢迎使用百度呼唤后台管理系统
		</div>
		<!-- <div id="back">
			<a href="#">返回首页</a>&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="#">帮助</a>
		</div> -->
	</div>
	<div id="login_center">
		<div id="login_area">
			<div id="login_form">
				<form action="../LoginController.do" method="post" onsubmit="return ckAll()">
					<div id="login_tip">
						用户登录&nbsp;&nbsp;UserLogin
					</div>
					<div><input type="text" class="username" name="username" value="请输入用户名" onmouseout="checkName(this)" onfocus="clearName(this)" /></div>
					<div><input type="text" class="pwd" name="pwd" value="请输入密码" onmouseout="checkPwd(this)" onfocus="clearPwd(this)"/></div>
					<div id="btn_area">
						<input type="submit" name="submit" id="sub_btn" value="登&nbsp;&nbsp;录">&nbsp;&nbsp;
						<input type="text" class="verify" id="imgCode" name="imgCode">
						<img src="../ImageCode.do" id="img" title="验证码" alt="加载失败" width="80" height="40"><a href="javascript:changeImg()">看不清</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="login_bottom">
		版权所有
	</div>
</body>
</html>
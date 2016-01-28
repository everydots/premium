<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>


<link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">
<link href="${ctx}/static/bootstrap/2.2.2/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/static/styles/default.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/static/jquery/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>

<html>
<head>
	<title>登录页</title>
	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
		
		$(document).ready(function() {
			$("#captcha").click(function(){
	    		$(this).attr("src", "${ctx}/Captcha.jpg?time=" + new Date());
	    		return false;
	    	});
		});
	</script>
</head>

<body>
	<form id="loginForm" action="${ctx}/login" method="post" class="form-horizontal">
	<%
	String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
	if(error != null){
	%>
		<div class="alert alert-error input-medium controls">
			<button class="close" data-dismiss="alert">×</button>登录失败，请重试.
		</div>
	<%
	}
	%>
	
		<div class="control-group">
			<label for="companyid" class="control-label">公司id:</label>
			<div class="controls">
				<input type="text" id="companyid" name="companyid"  value="${companyid}" class="input-medium required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label for="username" class="control-label">用户名:</label>
			<div class="controls">
				<input type="text" id="username" name="username"  value="${username}" class="input-medium required"/>
			</div>
		</div>
		<div class="control-group">
			<label for="password" class="control-label">密&nbsp;&nbsp;&nbsp;码:</label>
			<div class="controls">
				<input type="password" id="password" name="password" class="input-medium required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label for="captcha_key" class="control-label">验证码:</label>
			<div class="controls">
				<input type="text" id="captcha_key" name="captcha_key" value="${captcha_key}" class="input-medium required"/>
				<span><img src="${ctx}/Captcha.jpg" alt="点击刷新验证码" width="75" height="24" id="captcha"/></span>
			</div>
		</div>
				
		<div class="control-group">
			<div class="controls">
				<label class="checkbox" for="rememberMe"><input type="checkbox" id="rememberMe" name="rememberMe"/> 记住我</label>
				<input id="submit_btn" class="btn btn-primary" type="submit" value="登录"/> <a class="btn" href="${ctx}/register">注册</a>
			 	<span class="help-block">(管理员: <b>admin/admin</b>, 普通用户: <b>user/user</b>)</span>
			</div>
		</div>
	</form>
</body>
</html>

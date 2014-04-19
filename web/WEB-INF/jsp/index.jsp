<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    
    <br><br>
    <a href="${pageContext.request.contextPath}/user/queryAllUser.do">用户管理</a>
    <br><br>
    <a href="${pageContext.request.contextPath}/role/queryAllRole.do">角色管理</a>
    
    <br><br>
    <a href="${pageContext.request.contextPath}/resource/queryAllResource.do">资源管理</a>
    
    <br><br>
    <a href="${pageContext.request.contextPath}/privilege/queryAllPrivilege.do">权限管理</a>
    
    
    <br><br>
    <a href="${pageContext.request.contextPath}/userRole/queryAllUserRole.do">用户角色管理</a>
  
 	<br><br>
    <a href="${pageContext.request.contextPath}/userPrivilege/queryAllUserPrivilege.do">用户权限管理</a>
  
 	<br><br>
    <a href="${pageContext.request.contextPath}/rolePrivilege/queryAllRolePrivilege.do">角色权限管理</a>
  
	<br><br>
    <a href="${pageContext.request.contextPath}/type/queryAllType.do">操作类型管理</a>
  	
  </body>
</html>

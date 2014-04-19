<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="easyui/jquery.min.js"></script>   
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>  
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

 </head>
  
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">north region</div>
	<div data-options="region:'west',split:true,title:'权限管理'" style="width:150px;padding:10px;">
		
	    <a href="#" onclick="changeContent('user/queryAllUser.do');" >用户管理</a>
		
	    <br><br>
	    <a href="#" onclick="changeContent('role/queryAllRole.do');">角色管理</a>
	    
	    <br><br>
	    <a href="#" onclick="changeContent('resource/queryAllResource.do');">资源管理</a>
	    
	    <br><br>
	    <a href="#" onclick="changeContent('privilege/queryAllPrivilege.do');">权限管理</a>
	    
	    <br><br>
	    <a href="#" onclick="changeContent('userRole/queryAllUserRole.do');">用户角色管理</a>
	  
	 	<br><br>
	    <a href="#" onclick="changeContent('userPrivilege/queryAllUserPrivilege.do');">用户权限管理</a>
	  
	 	<br><br>
	    <a href="#" onclick="changeContent('rolePrivilege/queryAllRolePrivilege.do');">角色权限管理</a>
	  
		<br><br>
	    <a href="#" onclick="changeContent('type/queryAllType.do');">操作类型管理</a>
	  	
		
	</div>
	<!-- <div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div> -->
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div id="centerDiv" style="background:#eee;" data-options="region:'center',noheader:'true',border:false">
		
		<iframe src="about:blank" name="mainFrame" id="mainFrame" frameborder="no" scrolling="auto" hidefocus></iframe>
			  
	</div>
	
</body>

</html>
<script>

function changeContent(uri){
//	alert(uri);
	document.getElementById("mainFrame").src=uri;
	/* $('#centerDiv').layout({
		href:"index.jsp"
	}); */
}
</script>

<style type="text/css">
#mainFrame {
width: 100%;
_width: expression(document.body.offsetWidth - 192 + 'px');
height: 100%;
}

</style>
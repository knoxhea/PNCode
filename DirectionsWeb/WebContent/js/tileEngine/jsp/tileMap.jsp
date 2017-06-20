<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src = "jquery.js" type="text/javascript"></script>


<title>GPS</title>
<style type="text/css">
	#container{
		width:50px;
		height:50;
		position:relative;
		outline:1px solid black;
	
	}
	
	.road{
		hight: 10px;
		width: 10px;
		position: relative;
		float: left;
		background-color: black
	}
	
	.wall{
		hight: 10px;
		width: 10px;
		position: relative;
		float: left;
		background-color: tan;
	}
	
	.start{
		hight: 10px;
		width: 10px;
		position: relative;
		float: left;
		background-color: tan;
		background-image: start;
	}
	
	.end{
		hight: 10px;
		width: 10px;
		position: relative;
		float: left;
		background-color: tan;
		background-image: end;
	}
	
	.route{
		hight: 10px;
		width: 10px;
		position: relative;
		float: left;
		background-color: red;
		
	}
</style>

</head>
<body>

	<div id='container'></div>

</body>
</html>
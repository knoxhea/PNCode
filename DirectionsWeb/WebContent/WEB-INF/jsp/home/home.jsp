<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
 	
 	<h1> Shortest Route</h1>
 	
 	<canvas id="route Canvas" width="200" height="100" style="border:1px solid #000000;">
	</canvas>
 	
 	<button id="uploadButton" type="button" class="btn btn-info">Upload a Map</button>
 	
 	<!-- Upload Modal -->
 	<div id="uploadModal" class="mocal fade" role= "dialog">
 		<div class="modal-dialog">
 			<div class="modal-content">
 			</div>
 		</div>
 	</div>
 	
 	
</body>
</html>
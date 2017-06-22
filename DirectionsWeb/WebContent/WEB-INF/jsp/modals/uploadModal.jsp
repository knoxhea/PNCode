<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload a Map</title>
</head>
<body>
	<!-- Modal -->
<div id="uploadModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Modal Header</h4>
      </div>
      <div class="modal-body">
        <form>
 			<div class="form-group">
    			<label for="uploadSelect">Select a map</label>
    			<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
    			<small id="fileHelp" class="form-text text-muted">Select a text file map</small>
    		</div>
		</form>
      </div>
      <div class="modal-footer">
      	 <button id="uploadSubmit" type="submit" class="btn btn-primary">Submit</button>
    	 <button class="btn btn-primary" data-dismiss="modal">Cancel</button>
      </div>
    </div>

  </div>
</div>
</body>
</html>
/**
 * 
 */
_Directions_.upload = {
		Init: function(){
			var $this = this;
			$( "#uploadSubmit" ).click(function() {
				$this.submit_for_upload
			});
		}

	submit_for_upload : function(){
			var relativeURL;
			var formData;
//				// Check the file type.
//			  if (!file.type.match('txt.*')) {
//				    continue;
//				  }
//			// Add the file to the request.
//			  formData.append(name, file, filename);
//			}
//			
//			xhr.open('POST', 'handler.php', true);
//			
//			var jsonFormValue = JSON.stringify(formDataArray);
//			
//			xhr.onload = function () {
//				  if (xhr.status === 200) {
//				    // File(s) uploaded.
//				    uploadButton.innerHTML = 'Upload';
//				  } else {
//				    alert('An error occurred!');
//				  }
//				};
	}
}
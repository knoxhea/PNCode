/**
 * 
 */


//var mapArray=[
//	[#,#,#,#,#,#]
//	[#,A,.,.,.,#]
////	[#,.,.,.,.,#]
//	[#,.,.,.,B,#]
//	[#,#,#,#,#,#]
	
//] //THis would get replaced with a load map.js

function drawMap(mapArray){
	for(var i = 0;i<mapArray.length; i++){
		for(var j=0; j<mapArray[i].length; j++){
			if(parseInt(mapArray[i][j] == '#'){
				$('#container').append('<div class="wall"></div>');
			}
			if(parseInt(mapArray[i][j] == '.'){
				$('#container').append('<div class="road"></div>');
			}
			if(parseInt(mapArray[i][j] =='A'){
				$('#container').append('<div class="start"></div>');
			}
			if(parseInt(mapArray[i][j] == 'B'){
				$('#container').append('<div class="end"></div>');
			}
			if(parseInt(mapArray[i][j] == '@'){
				$('#container').append('<div class="route"></div>');
			})
		}
	}
}


/**
 * This would be used to load the original map.
 * @Param takes in 2d array of a map
 */
function loadMap(map){
	
	//make ajax call to get the map from the back end
	var map =;
	//render it to the canvas with draw map
	drawMap(mapArray);

}




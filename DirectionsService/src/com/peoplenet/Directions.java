package com.peoplenet;

public class Directions {
	
	char[][]roadMaze;
	Graph directionsGraph = new Graph();
	
	public Directions(char[][] maze){
		this.roadMaze = maze;
	}

	public Graph BuildRoadMap(char[][] roadMaze){
		Graph mazeGraph = new Graph();
		
		findVerticies(roadMaze, mazeGraph);
		findEdges(roadMaze,mazeGraph);
		
		setDirectionsGraph(mazeGraph);
	}

	
	/**
	 * TODO comment
	 * @param map
	 * @param graph
	 */
	private void findVerticies(char [][] map, Graph graph){
		Vertex vertex;
		
		int vertexNumber = 0;
		int roadCount = 0;
		
		
		for(int x = 0;x<map.length;x++){
			for(int y = 0; y<map[x].length; y++){
				
				//remove top and bottom from the equation
				if(x!=0 || x!=map.length){
					if(y!=0 || y!=map[x].length){
						//NOTE:  We only care about resetting vertex if we there is a possiblility of a new vertex.
						//clear out the vertex and reset counts
						if(map[x][y] != '#'){
							if(map[x][y]) == 'A'){
								vertex = new Vertex("A"));
							}
							else if(map[x][y] == 'B'){
								vertex = new Vertex("B");
							}
							else{
								vertex = new Vertex("vertex"+vertexNumber);
								vertexNumber++;
							}
						
							//check above for an '.'
							if(checkForRoadAbove(map,vertex.getXCoordinate(),vertex.getYCoordinate())){
								vertex.setUpPath(true);
								roadCount++;
							}
							//check below
							if(checkForRoadBelow(map,vertex.getXCoordinate(),vertex.getYCoordinate())){
							vertex.setDownPath(true);
							roadCount++;
							}
							//check to the left
							if(checkForRoadLeft(map,vertex.getXCoordinate(),vertex.getYCoordinate())){
								vertex.setLeftPath(true);
								roadCount++;
							}
							//check to the right
							if(checkForRoadRight(map,vertex.getXCoordinate(),vertex.getYCoordinate())){
								vertex.setRightPath(true);
								roadCount++;
							}
							
							
							if(vertex.getVertexName() !="A"||vertex.getVertexName()!="B"){
								//If Vertex has a road count higher than one then it could be a vertex
								// if the vertex only has right and left or up and down then it is not a vertex
								if(roadCount>1&&((!onlyHorizontalMovement(vertex))||(!onlyVerticalMovement(vertex)))){
									graph.addVertex(vertex);
								}
							}
							//if the spot is A or B then it is automatically a vertex
							else{
								graph.addVertex(vertex);
							}
						}
					}
				}
			}
		}
	}
		
	private boolean checkForRoadAbove(char [][] map, int xCoord, int yCoord){
		//check above for an '.'
		if(map[xCoord][yCoord-1] == '.'){
			return true;
		}
		return false;
		
	}
	
	private boolean checkForRoadBelow(char [][] map, int xCoord, int yCoord){
		//check below
		if(map[xCoord][yCoord+1] == '.'){
			return true;
		}
		return false;
	}
	
	private boolean checkForRoadLeft(char [][] map, int xCoord, int yCoord){
		//check to the left
		if(map[xCoord-1][j] == '.'){
			return true; 
		}
		return false;			
	}
	
	private boolean checkForRoadRight(char [][] map, int xCoord, int yCoord){
		//check to the right			
		if(map[xCoord+1][yCoord] == '.'){
			
			return true;
		}
		return false;
	}
	
	
	private void findEdges(char [][] map, Graph graph){
		Map verticies = graph.getVerticesMap();
		
		for(l)
	}

}

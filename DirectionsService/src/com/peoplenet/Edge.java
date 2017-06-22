package com.peoplenet;
import java.util.ArrayList;
import java.util.List;

public class Edge {
	
	Vertex connectedVertex1;
	Vertex connectedVertex2;
	
	List<Vertex> connectedVerticies;
	
	int distance;
	
	
	//CONSTRUCTORS
	
	public Edge(){
		this.connectedVertex1 = new Vertex();
		this.connectedVertex2 = new Vertex();
		//TODO: Do I need to distinguish this as list since list with vertex1, 2 and list with vertex 2, 1 should be the same?  have graph know this?(use contains)
		this.connectedVerticies = new ArrayList<>();
		this.connectedVerticies.add(connectedVertex1);
		this.connectedVerticies.add(connectedVertex2);
		
		this.distance = 0;
	}
	
	public Edge(Vertex connectedVertex1,Vertex connectedVertex2){
		this.connectedVertex1 = connectedVertex1;
		this.connectedVertex2 = connectedVertex2;
		
		this.connectedVerticies = new ArrayList<>();
		this.connectedVerticies.add(connectedVertex1);
		this.connectedVerticies.add(connectedVertex2);
		
		this.distance = determineDistance(this.connectedVertex1,this.connectedVertex2);
	}
	
	
	//PUBLIC METHODS
	
	/**
	 * This method checks to see if this edge connects the specified vertex given by
	 * checking to see if the given vertex matches either connected vertex1 or 
	 * connected vertex2.
	 * @param myVertex - the vertex to be checked against vertex1 and vertex2
	 * @return a boolean depicting whether or not the edge connects the given vertex.
	 */
	public boolean connectsVertex(Vertex myVertex){
		if(myVertex.equals(getConnectedVertex1())||myVertex.equals(getConnectedVertex2())){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Looks at the two verticies that are joined by the edge.  If one matches both x and y 
	 * coordinates with the given x and y coordinates, then the edge connects the given vertex with another.
	 * @param xCoord - the x coordinate of the vertex in question
	 * @param yCoord - y coordinate of the vertex in question
	 * @return returns a boolean value depicting whether or not the vertex at the given x and y is connected to
	 * 					another vertex by this edge
	 */
	public boolean connectsVertexAt(int xCoord, int yCoord){
		Vertex vertex1 = getConnectedVertex1();
		Vertex vertex2 = getConnectedVertex2();
		
		//if given x or y coordinate match either vertex1 or vertex2 then return true
		if((hasXCoordinate(vertex1,xCoord) && hasYCoordinate(vertex1,yCoord))||(hasXCoordinate(vertex2,xCoord) && hasYCoordinate(vertex2,yCoord))){
			return true;
		}
		return false;
	}
	
	//PRIVATE HELPER METHODS
	
	/**
	 * Private helper method to see if the given vertex has the given x coordinate.
	 * @param myVertex - vertex to be checked
	 * @param xCoordinate - coordinate in question
	 * @return returns a boolean on whether or not the vertex has the x value specified.
	 */
	private boolean hasXCoordinate(Vertex myVertex, int xCoordinate){
		if(myVertex.getXCoordinate() == xCoordinate){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Private helper method to see if the given vertex has the given x coordinate.
	 * @param myVertex - vertex to be checked
	 * @param yCoordinate - coordinate in question
	 * @return returns a boolean on whether or not the vertex has the y value specified.
	 */
	private boolean hasYCoordinate(Vertex myVertex, int yCoordinate){
		if(myVertex.getYCoordinate() == yCoordinate){
			return true;
		}
		
		return false;
	}

	/**
	 * Determines the distance between the two points.
	 * NOTE: Since the verticies are only using positive numbers
	 * (due to the double array translation), this method does not 
	 * account for negatives.  
	 * EX)  (-7) - 7 would  = 14  and  so would 7-(-7) is accounted for and the method
	 * @return returns and integer value of the distance between the two points
	 * @throws this throws and illegal arguement exceptioin i
	 */
	private int determineDistance(Vertex vertex1,Vertex vertex2){

		int distance = 0;
		
//		if(vertex1.getXCoordinate() == vertex2.getXCoordinate() && vertex1.getYCoordinate() == vertex2.getYCoordinate()){
//			throw new IllegalArguemntException("cannot pass the same vertex twice");
//		} TODO: do I need to care about the same vertex being passed twice?
		
		//if x coordinates are the same then the distance will be between the y coordinates.
		if(vertex1.getXCoordinate() == vertex2.getXCoordinate()){
			int x1 = vertex1.getXCoordinate();
			int x2 = vertex2.getXCoordinate();
			
			if(x1>x2){
				distance = x1-x2;
			}
			else{
				distance = x2-x1;
			}
			
		}
		
		//if y coordinates are the same then the distance will be between x coordinates.
		else if(vertex1.getYCoordinate() == vertex2.getYCoordinate()){
			int y1 = vertex1.getXCoordinate();
			int y2 = vertex2.getXCoordinate();
			
			if(y1>y2){
				distance = y1-y2;
			}
			else{
				distance = y2-y1;
			}
		}
		
		return distance;
	}
	
	
	//GETTERS AND SETTERS
	
	
	/**
	 * @return the connectedVertex1
	 */
	public Vertex getConnectedVertex1() {
		return connectedVertex1;
	}

	/**
	 * @param connectedVertex1 the connectedVertex1 to set
	 */
	public void setConnectedVertex1(Vertex connectedVertex1) {
		this.connectedVertex1 = connectedVertex1;
		
		//update distance
		setDistance(determineDistance(connectedVertex1,getConnectedVertex2()));
	}

	/**
	 * @return the connectedVertex2
	 */
	public Vertex getConnectedVertex2() {
		return connectedVertex2;
	}

	/**
	 * @param connectedVertex2 the connectedVertex2 to set
	 */
	public void setConnectedVertex2(Vertex connectedVertex2) {
		this.connectedVertex2 = connectedVertex2;
		
		//update distance
		setDistance(determineDistance(connectedVertex2,getConnectedVertex1()));
	}

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	private void setDistance(int distance) {
		this.distance = distance;
	}

	
}

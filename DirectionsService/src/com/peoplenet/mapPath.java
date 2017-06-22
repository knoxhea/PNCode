package com.peoplenet;

/**
 * This is a basic tuple object that holds the 
 * map and the number of @.  @ indicates the proper map area.
 * @author Heather Knox
 *
 */
public class mapPath {
	private char [][] map;
	private int pathSize;
	
	/**
	 * Constructor that requires a map and pathsize
	 * @param map the map provided in a character array
	 * @param pathSize - the pathsize indicated by the number of @ symbols.
	 */
	public mapPath(char [][] map, int pathSize){
		this.map = map;
		this.pathSize = pathSize;
	}

	/**
	 * getter for the map
	 * @return the map
	 */
	public char[][] getMap() {
		return map;
	}

	/**
	 * setter for the map
	 * @param map - the map to set
	 */
	public void setMap(char[][] map) {
		this.map = map;
	}

	/**
	 * getter for the path size (number of @)
	 * @return integer value of the path symbols.
	 */
	public int getPathSize() {
		return pathSize;
	}

	/**
	 * setter for the path size
	 * @param pathSize - path size to be set
	 */
	public void setPathSize(int pathSize) {
		this.pathSize = pathSize;
	}
	
	
}

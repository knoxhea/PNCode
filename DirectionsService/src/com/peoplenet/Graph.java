package com.peoplenet;
import java.util.HashMap;
import java.util.TreeSet;

public class Graph {
	
	private static final TreeSet<Vertex> EMPTY_SET = new TreeSet<Vertex>();
	
	private HashMap<Vertex, TreeSet<Vertex>> adjacentList;
	private HashMap<String, Vertex> vertices;
	
	private int numVertices;
	private int numEdges;

	public Graph(){
		adjacentList = new HashMap<Vertex, TreeSet<Vertex>>();
		vertices = new HashMap<String, Vertex>();
		numVertices = 0;
		numEdges = 0;
	}
	
	/**
	 * Add a new vertex name with no neighbors (if vertex doesn't exist currently)
	 * 
	 * @param myVertex - vertex to be added
	 */
	public Vertex addVertex(Vertex myVertex) {
		if(!vertices.containsValue(myVertex)){
			vertices.put(myVertex.getVertexName(),myVertex);
		}
	}
	
	/**
	 * Returns the Vertex matching v
	 * @param name a String name of a Vertex that may be in
	 * this Graph
	 * @return the Vertex with a name that matches v or null
	 * if no such Vertex exists in this Graph
	 */
	public Vertex getVertex(String name) {
		return vertices.get(name);
	}
	
	
	/**
	 * Returns true iff v is in this Graph, false otherwise
	 * @param name a String name of a Vertex that may be in
	 * this Graph
	 * @return true if and only if v is in this Graph
	 */
	public boolean hasVertex(String name) {
		return vertices.containsKey(name);
	}
	
	/**
	 * Is from-to, an edge in this Graph. The graph is 
	 * undirected so the order of from and to does not
	 * matter.
	 * @param from the name of the first Vertex
	 * @param to the name of the second Vertex
	 * @return true iff from-to exists in this Graph
	 */
	public boolean hasEdge(String from, String to) {

		if (!hasVertex(from) || !hasVertex(to))
			return false;
		return adjacentList.get(vertices.get(from)).contains(vertices.get(to));
	}
	
	
	/**
	 * Add set of neighbors, from is to's neighbor and to is from's neighbor
	 * Does not add an edge if another edge
	 * already exists
	 * @param from - the name of the first Vertex
	 * @param to - the name of the second Vertex
	 */
	public void addEdge(String from, String to) {
		Vertex v, w;
		if (hasEdge(from, to))
			return;
		numEdges += 1;
		if ((v = getVertex(from)) == null)
			v = addVertex(from);
		if ((w = getVertex(to)) == null)
			w = addVertex(to);
		adjacentList.get(v).add(w);
		adjacentList.get(w).add(v);
	}
	
	/**
	 * Return an iterator over the neighbors of Vertex named v
	 * @param name the String name of a Vertex
	 * @return an Iterator over Vertices that are adjacent
	 * to the Vertex named v, empty set if v is not in graph
	 */
	public Iterable<Vertex> adjacentTo(String name) {
		if (!hasVertex(name))
			return EMPTY_SET;
		return adjacentList.get(getVertex(name));
	}
	
	/**
	 * Return an iterator over the neighbors of Vertex v
	 * @param v the Vertex
	 * @return an Iterator over Vertices that are adjacent
	 * to the Vertex v, empty set if v is not in graph
	 */
	public Iterable<Vertex> adjacentTo(Vertex v) {
		if (!adjacentList.containsKey(v))
			return EMPTY_SET;
		return adjacentList.get(v);
	}
	
	/**
	 * Returns an Iterator over all Vertices in this Graph
	 * @return an Iterator over all Vertices in this Graph
	 */
	public Iterable<Vertex> getVertices() {
		return vertices.values();
	}
	

	/**
	 * @return the adjacentList
	 */
	public HashMap<Vertex, TreeSet<Vertex>> getAdjacentList() {
		return adjacentList;
	}

	/**
	 * @param adjacentList the adjacentList to set
	 */
	public void setAdjacentList(HashMap<Vertex, TreeSet<Vertex>> adjacentList) {
		this.adjacentList = adjacentList;
	}

	/**
	 * @return the numVertices
	 */
	public int getNumVertices() {
		return numVertices;
	}

	/**
	 * @param numVertices the numVertices to set
	 */
	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	/**
	 * @return the numEdges
	 */
	public int getNumEdges() {
		return numEdges;
	}

	/**
	 * @param numEdges the numEdges to set
	 */
	public void setNumEdges(int numEdges) {
		this.numEdges = numEdges;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(HashMap<String, Vertex> vertices) {
		this.vertices = vertices;
	}
	
	public HashMap<String, Vertex> getVerticesMap(){
		return verticies;
	}

	/**
	 * To String method
	 */
	public String toString() {
		String s = "";
		for (Vertex v : vertices.values()) {
			s += v + ": ";
			for (Vertex w : adjacentList.get(v)) {
				s += w + " ";
			}
			s += "\n";
		}
		return s;
	}
	
	/**
	 * Finds the shortest path between two given vertexes
	 * @param a - the first vertext
	 * @param b - the second vertex in which the distance from a should be the shortest route possible
	 * @return the shortest path
	 */
	public hashMap<String, int> shortestPath(Vertex a, Vertext b){
		//cant do hash map... need a way to say vertext name, length, direction for shortest path
		//example vertex a to h has length of 3 and goes left. vertext h to g has length 9 and goes up, vertext g to b has length 2 and goes right.
	}


}

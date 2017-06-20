
public class Vertex {

	private String vertexName;
	
	private int xCoordinate;
	
	private int yCoordinate;
	
	private boolean upPath;
	private boolean downPath;
	private boolean leftPath;
	private boolean rightPath;
	
	public Vertex(){
		this.vertexName = "";
		
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		
		this.upPath = false;
		this.downPath = false;
		this.leftPath = false;
		this.rightPath = false;
	}
	
	/**
	 * Constructor for vertex.  By default it sets the coordinates to be 0,0
	 * @param name - name of the vertex
	 */
	public Vertex(String vertexName){
		this.vertexName = vertexName;
		
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		
		this.upPath = false;
		this.downPath = false;
		this.leftPath = false;
		this.rightPath = false;
		
	}
	
	/**
	 * Constructor for vertex.  The user defines name x and y coordinates (x,y)
	 * @param name - name of vertex.
	 * @param xCoordinate - x  coordinate location of the vertex 
	 * @param yCoordinate - y coordinate location of the vertex
	 */
	public Vertex(String vertexName, int xCoordinate, int yCoordinate){
		this.vertexName = vertexName;
		
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		
		this.upPath = false;
		this.downPath = false;
		this.leftPath = false;
		this.rightPath = false;
	}

	/**
	 * @return the vertexName
	 */
	public String getVertexName() {
		return vertexName;
	}

	/**
	 * @param vertexName the vertexName to set
	 */
	public void setVertexName(String vertexName) {
		this.vertexName = vertexName;
	}

	/**
	 * @return the xCoordinate
	 */
	public int getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * @param xCoordinate the xCoordinate to set
	 */
	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	/**
	 * @return the yCoordinate
	 */
	public int getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * @param yCoordinate the yCoordinate to set
	 */
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	/**
	 * @return the upPath
	 */
	public boolean hasUpPath() {
		return upPath;
	}

	/**
	 * @param upPath the upPath to set
	 */
	public void setUpPath(boolean upPath) {
		this.upPath = upPath;
	}

	/**
	 * @return the downPath
	 */
	public boolean hasDownPath() {
		return downPath;
	}

	/**
	 * @param downPath the downPath to set
	 */
	public void setDownPath(boolean downPath) {
		this.downPath = downPath;
	}

	/**
	 * @return the leftPath
	 */
	public boolean hasLeftPath() {
		return leftPath;
	}

	/**
	 * @param leftPath the leftPath to set
	 */
	public void setLeftPath(boolean leftPath) {
		this.leftPath = leftPath;
	}

	/**
	 * @return the rightPath
	 */
	public boolean hasRightPath() {
		return rightPath;
	}

	/**
	 * @param rightPath the rightPath to set
	 */
	public void setRightPath(boolean rightPath) {
		this.rightPath = rightPath;
	}
	
	
}

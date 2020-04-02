/**
 * 
 * @author trentondethy
 *
 */

public class Location {
	/**
	 * initializing instance variables
	 */
	private int xCoord;
	private int yCoord;
	
	
	/**
	 * open constructor
	 */
	public Location(){
		this.xCoord = 0;
		this.yCoord = 0;
	}//end open constructor
	
	/**
	 * Preferred Constructor
	 * @param xCoord
	 * @param yCoord
	 */
	public Location(int xCoord, int yCoord) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}//end preferred constructor

	/**
	 * setter for the coordinates
	 * @param xCoord
	 * @param yCoord
	 */
	public void update(int xCoord, int yCoord) {
		this.xCoord=xCoord;
		this.yCoord = yCoord;
	}//end setter for coordinates
	/**
	* getter for coordinates
 	* @return
 	*/
	public int[] getCoordinates() {
		int[] location = new int[1];
		return location;
	}//end getter for coordinates
}

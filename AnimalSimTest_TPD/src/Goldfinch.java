/**
 * 
 * @author trentondethy
 *
 */
public class Goldfinch extends Animal {

	double wingSpan;

	/**
	 * open constructor setting all variables to 0
	 */
	
public Goldfinch() {
		super();
		this.simID = 0;
		this.full = false;
		this.rested = true;
		this.wingSpan = 9.0;
	}//end open constructor

	/**
	 * Preferred Constructor
	 * @param simID
	 * @param location
	 * @param full
	 * @param rested
	 */
	public Goldfinch(int simID, int[] location, boolean full, boolean rested, double wingSpan) {
		super(simID, location, full, rested);
		// TODO Auto-generated constructor stub
		this.wingSpan = wingSpan;
		this.simID = simID;
		this.location = location;
		this.full = false;
		this.rested = true;
	}//end preferred constructor
/**
 * getter for wingSpan
 * @return wingSpan
 */
	public double getWingSpan() {
		return wingSpan;
	}
/**
 * 
 * setter for wingSpan
 * @param wingSpan
 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	/**
	 * @param wingSpan
	 */
	
	
	

	
		// TODO Auto-generated constructor stub
	}



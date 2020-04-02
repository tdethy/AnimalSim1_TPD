
import java.util.Random;

public abstract class Animal{

	Random generator = new Random(); //generates a random number that will be used for the boolean full and rested variables inside the eat and sleep methods
	protected int simID;
	int[] location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * open constructor
	 */

	public Animal() {
		super();
		this.simID = 0;
		this.location = location;
		this.full = false;
		this.rested = true;
	}//end open constructor


	/**
	 * preferred constructor for Animal
	 * @param simID
	 * @param location
	 * @param full
	 * @param rested
	 */
	public Animal(int simID, int[] location, boolean full, boolean rested) {
		super();
		this.simID = simID;
		this.location = location;
		this.full = full;
		this.rested = rested;
	}//end preferred constructor

	/**
	 * eat method, returns boolean for full 
	 * @return full
	 */
	public boolean eat() {
		float a = generator.nextFloat();
		if (a < .5)
			return this.full = true;
			else
				return this.full = false;
	}//end eat method
	
	/**
	 * sleep method, sees if the animal is rested
	 * @return rested
	 */
	public boolean sleep() {
		float a = generator.nextFloat();
		if (a < .5)
			return this.rested = true;
			else
				return this.rested = false;
	}

/**
 * 
 * @returnSimID
 */
	public int getSimID() {
		return simID;
	}

/**
 * 
 * @param simID
 */
	public void setSimID(int simID) {
		this.simID = simID;
	}

/**
 * 
 * @return location
 */
	public int[] getLocation() {
		return location;
	}

/**
 * 
 * @param location
 */
	public void setLocation(int[] location) {
		this.location = location;
	}

/**
 * 
 * @return full
 */
	public boolean isFull() {
		return full;
	}

/**
 * 
 * @param full
 */
	public void setFull(boolean full) {
		this.full = full;
	}

/**
 * 
 * @return rested
 */
	public boolean isRested() {
		return rested;
	}

/**
 * 
 * @param rested
 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
}

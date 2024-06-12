import java.util.ArrayList;

/**
 * This class represents shared data containing an array list of integers,
 * a boolean array, a flag, and an integer constant.
 */
public class SharedData 
{
	private ArrayList<Integer> array;// ArrayList of integers
	private boolean [] winArray;// Boolean array for win status
	private boolean flag;// Flag for some condition
	private final int b;// Constant integer value
	
	/**
     * Constructs a SharedData object with the given array list of integers
     * and constant integer value.
     *
     * @param array The array list of integers to initialize.
     * @param b     The constant integer value to initialize.
     */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

/**
 * Returns the boolean array indicating win status.
 *
 * @return The boolean array indicating win status.
 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
    /**
     * Sets the boolean array indicating win status.
     *
     * @param winArray The boolean array to set.
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/**
     * Returns the array list of integers.
     *
     * @return The array list of integers.
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	/**
     * Returns the constant integer value {@code b}.
     *
     * @return The constant integer value {@code b}.
     */
	public int getB() 
	{
		return b;
	}
	/**
     * Returns the flag value indicating some condition.
     *
     * @return The flag value indicating some condition.
     */
	public boolean getFlag() 
	{
		return flag;
	}
	/**
     * Sets the flag value indicating some condition.
     *
     * @param flag The flag value to set.
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

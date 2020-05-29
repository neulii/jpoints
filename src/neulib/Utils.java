package neulib;

/**
 * Just an util class
 * 
 * @author neulii
 *
 */

public class Utils {
	
	/**
	 * check if a string is a number
	 * 
	 * @param number
	 * @return 
	 */
	public static boolean isNumeric(String number)
	{
		//when number is empty or just blanks
		if(number.isBlank() ||number.isEmpty())
		{
			return false;
		}
		
		int length = number.length();
		
		//check each character if digit
		for(int i = 0;i<length; i++)
		{
			if(!Character.isDigit(number.charAt(i))) {
				return false;
			}
		}
	
		return true;
	}
}

public class Day3Array4 {
	public static void main(String[] args)
	{

		
		int[] initializedArray 
			= new int[] { 55, 68, 125, 69, 13 };

		System.out.println("Given array ");

		for (int i = 0; i < initializedArray.length; i++) {

			System.out.println(initializedArray[i]);
		}
		int minValue = initializedArray[0];	
		
		for (int i = 0; i < initializedArray.length; i++) {
	if (initializedArray[i] < minValue)

				minValue = initializedArray[i];
		}

		System.out.println(
			"Smallest element present in given array: "
			+ minValue);
	}
}

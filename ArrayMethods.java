
public class week3assignment {
	
	public static void main(String[] args) {
		
		int[] ages = new int[7];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		
		
		//Task 1: Subtract the first element of the array from the last element, ensuring it works for dynamic array lengths.
		
		System.out.println(ages[ages.length -1] - ages[0]);
		
		
		//Task 2: calculate the mean age using enhanced for loop.
		
		int sum = 0;
		
		for (int age : ages) {
			sum += age;
			
		}
		
		int mean = sum / ages.length;
		
		System.out.println(mean);
		
		
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		//Task 3: calculate the average number of letters per name using a loop.
		
		int sum2 = 0;
		
		for (String name : names) {
			sum2 += name.length();
		}
		
		//Here I learned that adding the .0 to the end was very important. It kept showing 3 instead of 3.8. 
		
		double mean2 = 23.0 / 6.0; 
		
		System.out.println(mean2);
		
		
		//Task 4: Concatenate all the names together. 
		
		String concatenatedNames = "";
		
		for (String name: names) {
			concatenatedNames += name + " ";
		}
		
		System.out.println(concatenatedNames);
		
		//Task 5: Create a new int array that has the values of each name length from the previous array.
		
		int[] nameLength = new int[6];
	
		
		for (int x = 0; x < 6; x++) {
			nameLength[x] = names[x].length();
		}
		
		//Task 6: Iterate over the nameLength array and calculate the sum of all elements; Print it.
		
		int calculatedSum = 0;
		
		for (int value : nameLength) {
			calculatedSum += value;
		}
		
		System.out.println(calculatedSum);
		
		
		//Task 7: Write a method that takes a string and int argument and returns the string concatenated int number of times.
		
		System.out.println(NameLooper("Michael", 5));
		
		//Task 8: Write a method that returns a full name.
		
		System.out.println(FullNameCreator("Michael", "Miller"));
		
		//Task 9: Write a method that returns true if the sum of all array of ints is greater than 100;
		
		System.out.println(IsGreaterThanOneHundred(ages));
		
		//Task 10: Write a method that takes a doubles array and returns the mean.
		
		double [] doubleArray1 = {12.5, 11.5, 10.2, 3.8};
		
		System.out.println(MeanOfArray(doubleArray1));
		
		//Task 11: Compare the mean of two double arrays: is the first greater than the second?
		
		double [] doubleArray2 = {12.2, 101.2, 10.9, 3.1};
		
		System.out.println(DoesArrayOneHaveALargerMean(doubleArray1, doubleArray2));
		
		
		//Task 12: Return true if it's hot outside and money is greater than 10.50.
		
		System.out.println(willBuyDrink(true, 10.49));
		
		
		//Task 13: Create your own problem - take an array of names and check to see if any names are repeated.
		//See method at end for my thought process.
		
		System.out.println(IsNameRepeated(names));
		
	}
	
	public static String NameLooper(String name, int number) {
		String newName = "";
		for (int i = 0; i < number; i++) {
			newName += name;
		}
		
		return newName;
	}
	
	public static String FullNameCreator(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static boolean IsGreaterThanOneHundred(int[] array) {
		int total = 0;
		for (int value: array) {
			total += value;
		}
		
		return total > 100;
		
	}
	
	public static double MeanOfArray(double[] array) {
		double total = 0.0;
		for (double value: array) {
			total += value;
		}
		
		return total / array.length;
		
	}
	
	public static boolean DoesArrayOneHaveALargerMean(double[] array1, double[] array2) {
		double meanOfArray1 = MeanOfArray(array1);
		double meanOfArray2 = MeanOfArray(array2);
		
		return meanOfArray1 > meanOfArray2;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} 
		
		return false;
		
	}
	
	
	//I used a placeholder int and duplicated the array passed in. I then used a nested for loop.
	//For each iteration in the orignal array, we would also iterate over all the components of the duplicated array.
	//If there is a match, we'll add one. Since the arrays are identical, there should be one match per loop,
	//meaning that the numCheck variable should equal the length of the original array.
	//If numCheck is higher than the length of the original array, it means there were duplicates.
	
	public static boolean IsNameRepeated(String[] array) {
		String [] checkArray = array;
		int numCheck = 0;
		for (String value: array) {
			for (String checkValue: checkArray) {
				if (value == checkValue) {
					numCheck++;
				}
			}
		}
		if (numCheck > array.length) {
			return true;
		}
		return false;
	}
}

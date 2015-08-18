package amazonQuestionsJava;


public class ArrayFunctions {

	// In an array of integers, all numbers appear an even number of times. 
	// One number, however, appears an odd number of times. Find that number!

	public static int findOddIndexInArray(int[] array) {
		
		for (int outerIndex = 0; outerIndex < array.length-1 ; outerIndex++) {
		    int check = array[outerIndex];
		    int numberOfOccurences = 0;
		    for (int internalIndex = 0; internalIndex < array.length-1 ; internalIndex++) {
		        if (array[internalIndex] == check)
		        	numberOfOccurences++;
		    }
	    	if (numberOfOccurences % 2 == 1) {
	    		return check;
	    	}
		}
		return -1;
	}
	
	public static int bitwiseOddIndexArray(int[] array) {
		
		int result = 0;
		int size = array.length/array[0];
		for (int index = 0; index < size; index++) {
			result = result ^ array[index];
		}
		return result;
	}
	
	
	// Given an array of integers, and an integer value X, write a function that returns true iff 2 elements sum to X.
	
	
	
}
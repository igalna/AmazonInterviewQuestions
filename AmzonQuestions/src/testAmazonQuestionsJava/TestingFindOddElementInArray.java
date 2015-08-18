package testAmazonQuestionsJava;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import amazonQuestionsJava.ArrayFunctions;

public class TestingFindOddElementInArray {

	@Test
	public void testFindOddIndexInArray() {
		
		int [] array = { 1, 1, 2, 2, 4, 4, 3, 2, 3, 4, 4 }; // #=>2
		
		assertEquals(2, ArrayFunctions.findOddIndexInArray(array));
	}
	
	
	@Test
	public void testBitWiseElementInArray() {
		
		int [] array = { 1, 1, 2, 2, 4, 4, 3, 2, 3, 4, 4 }; // #=>2
		
		assertEquals(2, ArrayFunctions.bitwiseOddIndexArray(array));
		
	}

	@Test
	public void testMoreElementsInArrays() {
		
		int [] array = { 1, 1, 2, 4, 4, 3, 2, 3, 4, 4, 1 }; // #=>2
		
		assertEquals(1, ArrayFunctions.bitwiseOddIndexArray(array));
		
	}
	
}
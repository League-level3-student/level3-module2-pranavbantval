package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = new String[4];
		array[0]="dcb";
		array[1]="abc";
		array[2]="abd";
		array[3]="dab";
		assertEquals(1,_00_LinearSearch.linearSearch(array,"abc"));
		assertEquals(3,_00_LinearSearch.linearSearch(array,"dab"));
		assertEquals(-1, _00_LinearSearch.linearSearch(array, "bad"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = new int[3];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		assertEquals(0,_01_BinarySearch.binarySearch(array, 0, 2, 0));
		assertEquals(-1,_01_BinarySearch.binarySearch(array, 0, 2, 1999999999));
		assertEquals(2,_01_BinarySearch.binarySearch(array, 0, 2, 2));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = new int[4];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=4;
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 8));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(array, 1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(array, 2));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = new int[4];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=4;
	
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 12));
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(array, 2));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(array, 4));
	}
}

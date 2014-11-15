package exercise;

public class Exercise22MergeArray {
	
	static int[] intArr01 = new int[]{345, 32, 65 ,24 ,65 ,765 ,32 ,765 ,43};
	static int[] intArr12 = new int[]{3, 547, 65, 243, 877, 34, 98, 543, 23, 32, 24};
	static int[] intArr10 = new int[]{1, 1, -1, 1};
	static int[] intArr20 = new int[]{2, 2, -2, -1};
	static int[] intArr1 = new int[]{};
	static int[] intArr2 = new int[]{};
	static int[] intArr31 = new int[] {2};
	static int[] intArr32 = new int[]{-4};
	
	public static void main (String args[]) {
		fullSortUnique(intArr1, intArr2);
		
	}
//  method to merge int arrays	
	public static int[] intMergeBoth(int[] intArr1, int[] intArr2) {
		int len1 = intArr1.length;
		int len2 = intArr2.length;
		int newArrayLen = len1+len2;
		int[] mergeBoth = new int[newArrayLen];
		if (len1 == 0 && len2 == 0) {
			return null;
		}
		for (int i=0; i<newArrayLen; i++) {
			if (i<len1) {
				mergeBoth[i] = intArr1[i];
			}
			else {
				mergeBoth[i] = intArr2[i-len1];
			}
		}				
		return mergeBoth;
	}
//  method to flip adjacent elements in int array
	public static int[] lowerFlip(int[] intArr) {
		int temp;
		if (intArr == null) {
			return intArr;
		}
		for (int i=0; i<intArr.length-1; i++) {
			if (intArr[i] > intArr[i+1]) {
				temp = intArr[i+1];
				intArr[i+1] = intArr[i];
				intArr[i] = temp;
			}
		}
		return intArr;
	}
//  method to flip adjacent elements multiple times to fully sort array	
	public static int[] multiRun(int[] intArr) {
		if (intArr == null) {
			return null;
		}
		for (int each:intArr) {
			lowerFlip(intArr);
		}
		return intArr;
	}
//  method to find unique elements in array; needed to set sorted unique array
	public static int findUnique(int[] sortedArr) {
		int unique = 0;
		if (sortedArr.length < 1) {
			return unique;
		}
		else {
			unique = 1;
		}
		for (int i=0; i<sortedArr.length-1; i++) {
			if (sortedArr[i] != sortedArr[i+1]) {
				unique++;
			}
		}
		return unique;
	}
//  method to take sorted int array and create new array without duplicates	
	public static int[] uniqueSort(int[] sortedArr) {
		if (sortedArr == null) {
			return null;
		}
		int sLen = sortedArr.length;
		int[] uSort;
		uSort = new int[findUnique(sortedArr)];
		int uSortIndex = 0;
		if (sLen == 0) {
			return null;
		}
		for (int i=0; i<sLen-1; i++) {
			if (sortedArr[i] != sortedArr[i+1]) {
				uSort[uSortIndex] = sortedArr[i];
				uSortIndex++;
				}
		}
		if (sortedArr[sLen-1] != uSort[uSortIndex]) {
			uSort[uSortIndex] = sortedArr[sLen-1];
		}
		return uSort;
	}
	
	public static void fullSortUnique(int[] intArr1, int[] intArr2) {
		if (intArr1 != null && intArr2 != null) {
			int[] merged;
			merged = intMergeBoth(intArr1, intArr2);
			int[] partSort;
			partSort = lowerFlip(merged);
			int[] sorted;
			sorted = multiRun(partSort);
			int[] uniqueSort;
			uniqueSort = uniqueSort(sorted);			
			for(int each:uniqueSort) {
				System.out.println(each);
			}
		System.out.println("both arrays are empty");
			
		}
	}
}

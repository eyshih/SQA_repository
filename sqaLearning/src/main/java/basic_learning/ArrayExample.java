package basic_learning;

public class ArrayExample {

	public static void main(String[] args) { 		
		//We define and instantiate the int array object with size 3
		int[] intArr = new int[3];
		//We start populating individual array elements with values
		intArr[0] = 32;
		intArr[1] = 54;
		intArr[2] = 23;
		
		//We read the individual array elements
		int secondIndex = intArr[1];
		System.out.println("Value at 1st index is : "+intArr[0]);
		System.out.println("Value at 2nd index is : "+secondIndex);
		
		//We loop through the lenght of array and read every element
		for(int i=0; i<intArr.length; i++){
			System.out.println("Value at "+i+" index is : "+intArr[i]);
		}
		printSize(intArr);
		//another way to define, instantiate and initialize the array
		int[] anotherIntArr = new int[]{90,23,76,32,754,2432,543};
		
		//populate the array using for loop
		for(int i=0; i<anotherIntArr.length; i++){
			anotherIntArr[i] = i+10;
		}		
		printSize(anotherIntArr);
	}
	
	public static void printSize(int inputArr[]){
		System.out.println("Size of the array is : "+inputArr.length);
	}
}

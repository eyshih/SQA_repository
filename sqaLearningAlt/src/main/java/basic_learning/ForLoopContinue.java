package basic_learning;

public class ForLoopContinue {
	public static void main(String args[]){
		for(int i=1; i<=50; i++){
			if(i % 10 == 0){
				System.out.println("We got multiple of 10");
				//Do not go any further, continue the loop from the next i
				continue;
			}
			if(i == 35){
				break;
			}
			//This will come only when continue is not called
			System.out.println("Value of i is : "+i);
		}
	}
}

package inheritence;

public class CabServiceImpl implements IBusiness{

	public boolean isOpen(){
		return true;
	}

	public String getContactInfo(){
		return "123-456-7890";		
	}
	
	public int getCapacity(){
		return 4;
	}
	
	public String getCabType(){
		return "Hybrid";
	}	
}

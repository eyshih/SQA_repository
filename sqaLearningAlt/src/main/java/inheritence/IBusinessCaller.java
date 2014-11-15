package inheritence;

public class IBusinessCaller {
	
	public static void main(String args[]){
		CabServiceImpl bz1 = new CabServiceImpl();
		ResturantImpl bz2 = new ResturantImpl();
		
		System.out.println("Cab : "+bz1.getCapacity()+"\n"+bz1.getContactInfo()
				+"\n"+bz1.isOpen()+"\n"+bz1.getCabType());
		
		System.out.println("Resturant : "+bz2.getCapacity()+"\n"+bz2.getContactInfo()
				+"\n"+bz2.isOpen()+"\n"+bz2.getMenu(true));
		
	}
}

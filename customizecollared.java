//Class which helps in decorating the base item.
public class customizecollared extends collared  {
	//base object on which decoration is applied.
	protected tshirt collaredobject;
	
	public customizecollared(tshirt bp){
		collaredobject=bp;
	}
	
	public int addtext(double Cost,String text) {
		System.out.println("abcd");
		return 20;
		
	}
	
	public int addpic(double Cost) {
		System.out.println("pic added");
		return 50;
		
	}
	
	public int bgcolor(double Cost) {
		System.out.println("black");
		return 30;
		
	}
	
}

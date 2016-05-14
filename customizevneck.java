//Class which helps in decorating the base item.
public class customizevneck extends vneck  {
	//base object on which decoration is applied.
	protected tshirt vneckobject;
	
	
	
	public customizevneck(tshirt bp){
		vneckobject=bp;
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
		System.out.println("choose the background color");
		return 30;
		
	}
	
}



import java.util.Scanner;


public class client {
public static void main(String[] args){
	
	vneck cvneck=new vneck();
	collared ccollared =new collared();
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	String decision;
	String p;
	String q;
	
	System.out.println("Enter your background colour black or blue:");
	q= reader.nextLine();
	  
	  switch (q) {
                case "black":
                	System.out.println("background color ="+q);
                         break;
                case "blue":
                	System.out.println("background color ="+q);
                         break;
                default:
                	System.out.println("this color cannot be added(only black or blue)");
                    break;	
	  }

	 System.out.println("Enter the text you want to add?");
	 p= reader.nextLine();
	 System.out.println(" text added ="+p);
	
	System.out.println("do you want to add the picture , yes or no ?");
	decision = reader.nextLine();

    switch(decision){
   
    case "yes":
    	System.out.println(" picture added");
    	int total = cvneck.addpic() + cvneck.addtext() + cvneck.bgcolor();
    	System.out.println("total cost = Rs"+total);
    	break;
    case "no": 
    	System.out.println("picture not added");
    	int total1 =  cvneck.addtext() + cvneck.bgcolor();
    	System.out.println("total cost = Rs"+total1);
    	break;
    
    }
	
	

	
}
}



//uses decorator design pattern.
package gugudan;
import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단중 출력할 단은? ");
		Scanner iss= new Scanner(System.in);
      int number = iss.nextInt();
		//*System.out.println(number+"단"+number+"*"+1+"="+number*1);
		//System.out.println(number+"단"+number+"*"+2+"="+number*2);
		//System.out.println(number+"단"+number+"*"+3+"="+number*3);
		//System.out.println(number+"단"+number+"*"+4+"="+number*4);
		//System.out.println(number+"단"+number+"*"+5+"="+number*5);
		//System.out.println(number+"단"+number+"*"+6+"="+number*6);
		//System.out.println(number+"단"+number+"*"+7+"="+number*7);
		//System.out.println(number+"단"+number+"*"+8+"="+number*8);
		//System.out.println(number+"단"+number+"*"+9+"="+number*9);
	int i=1;	  
      while(i<10)
      {
    	  i =++i;
    	  System.out.println(number*i);
    	  
      }
			  
 //for(int i = 1; i<10;i++)
    	  
    	//  System.out.println(number*i);
    	  
      
      
		  }

}

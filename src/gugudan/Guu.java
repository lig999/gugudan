package gugudan;
import java.util.Scanner;



public class Guu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ssr = new Scanner(System.in); 
		   System.out.println("출력할 단의 숫자를 입력하세");
		int number = ssr.nextInt();
	 	   System.out.println("사용자가 입력한 값은? "+number);
		for(int i =1;i<10;i++)
			
		{  
			if(number<=2)
			{System.out.println( " ");}
			else if (number >=9)
			{
				System.out.println();
			}
			else 
			{System.out.println(number*i);}
			
			
		   }
		
			
		}
		
	}



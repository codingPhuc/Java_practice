package ex1;


public class  Program  
{
    public static void main(String[] args){
		

		if(args.length != 3 )
		{
			System.out.println("Invalid expression");
			return  ; 
		}
		int number_1  =  Integer.parseInt(args[0])  ; 
		int number_2  = Integer.parseInt(args[2])  ;  
		switch(args[1]) {
			case "x":
			  
				System.out.println(String.format("%2d", (number_1 * number_2)))  ; 
			  break;
			case "+":
				System.out.println(String.format("%2d", (number_1 + number_2)))  ; 
			  break;
			case "-":
				System.out.println(String.format("%2d", (number_1 - number_2)))  ; 

			  break;
			case "/":
				if(number_2 != 0)
					System.out.println(String.format("%2d", (number_1 / number_2)))  ;
				else 
					System.out.println("can not divide by  0");  
			  break;
			case "^":
				int hold =number_1  ; 
				while(number_2 >1) 
				{	
					number_1  = number_1* hold  ;
					number_2-- ; 
				}
				System.out.println(String.format("%2d", number_1 ));
			  break;
			default:
			  System.out.println("Unsupported operator")  ;
		  }
	}
}
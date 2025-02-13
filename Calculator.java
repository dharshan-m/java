import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);
		int result=0;
		switch(operator){
    		case'+':
    		result = a + b;
    		break;
    		
    		case'-':
    		result = a -b;
    		break;
    		
    		case'*':
    		result = a*b;
    		break;
    		
    		case'/':
    		result = a/b;
    		break;
    		
    		default:{
    		    System.out.println("invalid operator");
    		}
		}
		System.out.println(result);
	}
}
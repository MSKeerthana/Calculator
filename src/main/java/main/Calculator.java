package main;
import java.util.*; 

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        
        System.out.println("Enter your selection: 1. Addition, 2. substraction 3. Multiplication and 4. division:");
        int ch;
        ch = inp.nextInt();
        switch (ch){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Illegal");
        }
    }
    public static int add(int x, int y)
    {
    	int result=0;
    	result = x+y;
    	
        return x+y;
    }
    public static int sub(int x, int y)
    {
    	int result=0;
    	result =x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
    	int result=0;
    	result = x*y;
    	return result;
    }
    public static int div(int x, int y)
    {
    	int result=0;
    	result = x/y;
    	return result;
    }

}
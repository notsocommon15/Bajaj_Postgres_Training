import java.util.*;
public class Prime {
	 public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int a = s.nextInt(); 
	       s.close();
	       if (isPrime(a)) {  
	           System.out.println(a + " is a prime number");  
	       } else {  
	           System.out.println(a + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int a) {  
	       if (a <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(a); i++) {  
	           if (a % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
}

import java.util.Scanner;
public class ReversePrint {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        int [] arr = new int [5]; 
	        System.out.println("Enter array elements: ");  
	        for(int i = 0; i < arr.length; i++)
	        {
	        	arr[i] = sc.nextInt();
	        }
	        sc.close();
	        System.out.println("Elements of given array in reverse order: ");  
	          
	        for (int i = arr.length - 1 ; i >=0; i--) {  
	            System.out.print(arr[i] + " ");  
	        } 
	    }
}
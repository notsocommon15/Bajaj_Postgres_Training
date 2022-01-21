import java.util.Scanner;
public class DuplicateValues {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        int [] arr = new int [5]; 
	        System.out.println("Enter array elements: ");  
	        for(int i = 0; i < arr.length; i++)
	        {
	        	arr[i] = sc.nextInt();
	        }
	        sc.close();
	        System.out.println("Duplicate Elements of array: ");  
	          
	        for (int i = 0 ; i < arr.length-1; i++) {  
	             for(int j=i+1;j< arr.length; j++) {
	            	 if(arr[i]==arr[j])
	            	 {
	            		 System.out.print(arr[i]+ " ");
	            	 }
	             }
	        } 
	    }
}
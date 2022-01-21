public class BinarySearch {
	
	public static int binarySearch(int arr[], int l, int r, int a)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (arr[mid] == a)
                return mid;

            if (arr[mid] > a)
                return binarySearch(arr, l, mid - 1, a);

            return binarySearch(arr, mid + 1, r, a);
        }
 
        
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 20, 44 };
        int n = arr.length;
        int a = 5;
        int result = binarySearch(arr, 0, n - 1, a);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "
                               + result);
	}

}

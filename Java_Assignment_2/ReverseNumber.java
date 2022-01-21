
public class ReverseNumber {

	public static void main(String[] args) {
		int n = 123456;
		int sum=0;
		while(n>0)
		{
			int mod = n%10;
			sum = sum*10 + mod;
			n = n/10;
		}
		System.out.println(sum);

	}

}

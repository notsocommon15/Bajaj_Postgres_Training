public class TotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Subham Kedia";
		int c=0;
		for(int i=0;i<s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				c++;
			}
		}
		System.out.println("Total Number of Character: " + c);
	}

}

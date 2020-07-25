package shyamala.shyam;

public class Shyam_Chek {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shyamala";
		String rev= "";
		int k= str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			//System.out.println(str.charAt(i));
			 
			rev = rev+str.charAt(i);
			
			
		}
		
		System.out.println(rev);

}
}

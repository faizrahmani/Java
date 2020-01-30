package Use_All_Data_Types;

public class Comparison_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;
		int b = 100;
		
		//if (a==20) If we write anything else rather than 50 the answer will be no as a value is 50
		if (a == 50) {
			System.out.println("Yes a == 50");
		}
			else {
				System.out.println("No a != 50");
			}
		
		System.out.println(a==b); // False
		
		System.out.println(a>b); // False
		
		System.out.println(a<b); // True
		
		System.out.println(a!=b); // True
		
		System.out.println(a<=b); // True
		
		System.out.println(a>=b); // False
		
		
		
	}

}

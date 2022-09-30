package basics;

public class CoreJavaBtushUp3 {

	public static void main(String[] args) {

		
		//String s = "Rahul shetty Academy";
		String s1 = "Rahul shetty Academy";
		String s5 = "hello";
		
		String s2 = new String ("Wellcome");
		String s3 = new String ("Wellcome");
		
		String s = "Rahul shetty Academy";
		String[] splittedString = s.split("shetty ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}

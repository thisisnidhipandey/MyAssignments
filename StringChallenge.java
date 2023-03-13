package week3.day2;

public class StringChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("WORLD IS GREAT");
		
		String[] words = str.split(" ");
		int len = words.length;
		System.out.println("The last words is "+words[len-1]+ " "
				+ "and its length is "+words[len-1].length());
	
	}

}

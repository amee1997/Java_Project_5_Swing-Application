package PatternMatching;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String paswd = sc.next();
		String pattern = "((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{6,})";
		if(paswd.matches(pattern))
		{
			System.out.println("Valid Password");
		}
		
		else
		{
			System.out.println("Invalid Password\nPassword must contains Uppercase,Lowercase and Numbers ");
		}

	}

}

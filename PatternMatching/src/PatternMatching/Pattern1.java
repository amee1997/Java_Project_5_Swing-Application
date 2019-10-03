package PatternMatching;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String paswd = sc.next();
		String pattern = "((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!])(?=.\\S+$).{8,})";
		if(paswd.matches(pattern))
		{
			System.out.println("Valid Pssword");
		}
		
		else
		{
			System.out.println("Invalid Password");
		}

	}

}

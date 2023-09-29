package week3.day3;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String s: ");
		int a =sc.nextInt();
		System.out.println(sum(a));
	}
	
	static int sum(int a) {
		if(a==0) {
			return 0;
		}
		return a %10 +sum(a/10);
		
		

	}}

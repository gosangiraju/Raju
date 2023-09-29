package week3.day3;
import java.util.Scanner;
public class Sum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int a=sc.nextInt(); 
		boolean flag=false;
		for(int i=1; i<a; i++) {
			if((2^i)==a) {
				flag=true;
			}
			
		}
		System.out.println(flag);


}}


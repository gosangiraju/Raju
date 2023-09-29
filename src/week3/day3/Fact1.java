package week3.day3;

public class Fact1 {

	public static void main(String[] args) {
		int num=5;
		System.out.println(fact(num));
		
	}
	
	static int fact(int num) {
		if (num<=1) {
			return 1;
		}
		return num*fact(num-1);
	}

}

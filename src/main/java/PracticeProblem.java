import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input= new Scanner(System.in);
		System.out.print("In: ");
		String a= input.nextLine();
		System.out.println(a);
		input.close();


	}

	public static void q2() {
		//Write question 2 code here
		Scanner input= new Scanner(System.in);
		System.out.print("In: ");
		int b=input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		int c= input.nextInt();
		input.nextLine();
		System.out.println(b/c);
		System.out.println(b%c);
		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String d = input.nextLine();
		System.out.println(d + " was the text you wrote");
		input.close();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int e = input.nextInt();
		System.out.println(e*5);
		input.nextLine();
		input.close();

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner (System.in);
		System.out.print("In: ");
		boolean f = input.nextBoolean();
		System.out.println(f + " is a boolean");
		input.nextLine();
		input.close();
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double g = input.nextDouble();
		System.out.println(g - 3.2);
		input.nextLine();
		input.close();
		
	}

}

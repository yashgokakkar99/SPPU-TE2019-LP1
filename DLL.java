import java.util.Scanner;

public class dll {
	static {
		System.loadLibrary("dll");
	}

	public native int add(int num1, int num2);

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("DLL Example Addition Operation");
		System.out.print("Enter first number: ");
		num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		num2 = scanner.nextInt();
		System.out.println("Result: "+new dll().add(num1,num2));
	}
}

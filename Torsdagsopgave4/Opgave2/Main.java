import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please type you name");

		String name = in.nextLine();

		System.out.println("Hello " + name + " Please type your age");

		int age = Integer.parseInt(in.nextLine());

		System.out.println("You are " + age + " years old");

		int ageToRetire = 67 - age;
		
		System.out.println("You retire in " + ageToRetire + " years");

	}


}
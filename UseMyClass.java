
package myChapter02;

import java.util.Scanner;

public class UseMyClass {
	
	public static void main(String[] args) {
		// Create instance or object from Human class
		Human firstman = new Human("Albert","Lorence");
		Human firstwoman = new Human("Lita","Lorence",25,165,55);
		Scanner input = new Scanner(System.in);
				
		printDetailMan(firstman);
		printDetailWoman(firstwoman);
		
		System.out.print("Enter age of man : ");
		int age = input.nextInt();
		firstman.setAge(age);
		printDetailMan(firstman);
		
		firstwoman.increaseAge();
		printDetailWoman(firstwoman);
		
	}
	
	public static void printDetailMan(Human firstman) {
		System.out.println("Male : "+firstman.getName()+" "+firstman.getSurname());
		System.out.println("Detail :  Age > "+firstman.getAge());
		System.out.println("Height > "+firstman.getHeight());
		System.out.println("Weight > "+firstman.getWeight());
	}
	
	public static void printDetailWoman(Human firstwoman) {
		System.out.println("Female : "+firstwoman.getName()+" "+firstwoman.getSurname());
		System.out.println("Detail :  Age > "+firstwoman.getAge());
		System.out.println("Height > "+firstwoman.getHeight());
		System.out.println("Weight > "+firstwoman.getWeight());
	}
		

}

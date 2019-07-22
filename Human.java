package myChapter02;

public class Human {
//instance variables or data
	private String name;
	private String surname;
	private int age;
	private int height;
	private int weight;
	
	//Constructor method
	public Human(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Human(String name, String surname, int age, int height, int weight) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}



package practice07;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String introduce(){
		String tmp = "My name is " + this.getName() + ". I am "+ this.getAge() + " years old.";
		return tmp;
	}
}

package practice08;

public class Person {
	private String name;
	private int age;
	private int id;
	public Person(int id, String name, int age){
		this.name = name;
		this.age = age;
		this.id = id;
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
	public int getId(){
		return this.id;
	}
	@Override
	public int hashCode(){
		int myCode = this.getId();
		return myCode;
	}

}

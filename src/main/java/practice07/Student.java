package practice07;

public class Student extends Person{
	private Klass klass;
	public Student(String name, int age, Klass klass){
		super(name, age);
		this.klass = klass;
	}
	public Klass getKlass(){
		return this.klass;
	}
	@Override
	public String introduce(){
		String tmp = super.introduce()+" I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
		return tmp;
	} 
}

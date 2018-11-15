package practice11;
import java.util.LinkedList;

public class Student extends Person{
	private Klass klass;
	public Student(int id, String name, int age, Klass klass){
		super(id, name, age);
		this.klass = klass;
	}
	public Klass getKlass(){
		return this.klass;
	}
	public void setClass(Klass klass){
		this.klass = klass;
	}
	@Override
	public String introduce(){
		String tmp = super.introduce()+" I am a Student. ";
		if(this.klass.getLeader()!=null){
			tmp = tmp + "I am Leader of " + this.getKlass().getDisplayName() + ".";
		}
		else{
			tmp = tmp + "I am at " + this.getKlass().getDisplayName() + ".";
		}
		
		return tmp;
	}
}

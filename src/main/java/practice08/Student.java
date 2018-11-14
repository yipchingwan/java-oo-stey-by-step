package practice08;

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
		String tmp = super.introduce()+" I am a Student. ";
		if(this.klass.getLeader()!=null){
			tmp = tmp + "I Leader of " + this.getKlass().getDisplayName() + ".";
		}
		else{
			tmp = tmp + "I am at " + this.getKlass().getDisplayName() + ".";
		}
		
		return tmp;
	} 
}

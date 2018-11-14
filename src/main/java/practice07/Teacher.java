package practice07;

public class Teacher extends Person{
	private Klass klass;
	private boolean noClass = false;
	public Teacher(String name, int age, Klass klass){
		super(name, age);
		this.klass = klass;
	}
	public Teacher(String name, int age){
		super(name, age);
		this.noClass = true;
	}
	public Klass getKlass(){
		return this.klass;
	}
	@Override
	public String introduce(){
		String tmp = super.introduce()+" I am a Teacher. ";
		if(!noClass){
			tmp = tmp + "I teach Class " + this.getKlass().getNumber() + ".";
		}
		else{
			tmp = tmp + "I teach No Class.";
		} 
		return tmp;
	}
	public String introduceWith(Student s){
		String tmp = super.introduce()+" I am a Teacher. ";
		if(this.getKlass().getNumber()==s.getKlass().getNumber()){
			tmp = tmp + "I teach " + s.getName() + ".";
		}
		else{
			tmp = tmp + "I don't teach "+s.getName()+".";
		} 
		return tmp; 
	} 
}

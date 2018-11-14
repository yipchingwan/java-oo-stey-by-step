package practice06;

public class Teacher extends Person{
	private int klass;
	private boolean noClass = false;
	public Teacher(String name, int age, int klass){
		super(name, age);
		this.klass = klass;
	}
	public Teacher(String name, int age){
		super(name, age);
		this.noClass = true;
	}
	public int getKlass(){
		return this.klass;
	}
	@Override
	public String introduce(){
		String tmp = super.introduce()+" I am a Teacher. ";
		if(!noClass){
			tmp = tmp + "I teach Class " + this.getKlass() + ".";
		}
		else{
			tmp = tmp + "I teach No Class.";
		} 
		return tmp;
	} 
}

package practice11;
import java.util.LinkedList;

public class Teacher extends Person{
	
	private boolean noClass = false;
	LinkedList<Klass> klass = null;
	public Teacher(int id, String name, int age, LinkedList<Klass> klass){
		super(id, name, age);
		this.klass = klass;
		for(int i=0; i<this.getClasses().size(); i++){
			this.getClasses().get(i).setTeacher(this.getName());
		}

	}
	public Teacher(int id, String name, int age){
		super(id, name, age);
		this.noClass = true;
	}
	public LinkedList<Klass> getClasses(){
		return this.klass;
	}
	@Override
	public String introduce(){
		String tmp = super.introduce()+" I am a Teacher. I teach ";
		if(!noClass){
			tmp = tmp+"Class ";
			for(int i=0; i<this.getClasses().size(); i++){
				if(i==this.getClasses().size()-1){
					tmp = tmp + this.getClasses().get(i).getNumber()+".";
				}
				else{
					tmp = tmp + this.getClasses().get(i).getNumber()+", ";
				}
			}
			
		}
		else{
			tmp = tmp + "No Class.";
		} 
		return tmp;
	}
	public String introduceWith(Student s){
		String tmp = super.introduce()+" I am a Teacher. ";
		boolean Teaching = false;
		for(int i=0; i<this.getClasses().size(); i++){
			if(this.getClasses().get(i).getNumber() == s.getKlass().getNumber()){
				Teaching = true;
			}
		}
		if(Teaching){
			tmp = tmp + "I teach " + s.getName() + ".";
		}
		else{
			tmp = tmp + "I don't teach "+s.getName()+".";
		} 
		return tmp; 
	}
	public boolean isTeaching(Student s){
		boolean Teaching = false;
		for(int i=0; i<this.getClasses().size(); i++){
			if(this.getClasses().get(i).getNumber() == s.getKlass().getNumber()){
				Teaching = true;
			}
		}
		if(Teaching){
			return true;
		}
		else{
			return false;
		}

	}
}

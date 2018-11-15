package practice11;

public class Klass {
	private int number;
	private Student leader = null;
	private Student member = null;
	private String teacher = null;
	public Klass(int number){
		this.number = number;
	}

	public int getNumber(){
		return this.number;
	}
	public String getDisplayName(){
		return "Class "+ this.getNumber();
	}

	public void assignLeader(Student s){
		if(s.getKlass().getNumber()!=this.getNumber()){
			System.out.print("It is not one of us.\n");
		}
		else{
			this.leader = s;
			System.out.print("I am "+ this.teacher+". I know "+s.getName()+" become Leader of "+this.getDisplayName()+".\n");
			
		}

	}

	public Student getLeader(){
		return this.leader;
	}
	public void appendMember(Student s){
		
		this.member = s;
		s.setClass(this);
		System.out.print("I am "+this.teacher+". I know "+s.getName()+" has joined "+this.getDisplayName()+".\n");
		

	}
	public void setTeacher(String t){
		this.teacher = t;
	}
	
}

package practice08;

public class Klass {
	private int number;
	private Student leader = null;

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
		this.leader = s;
	}

	public Student getLeader(){
		return this.leader;
	}
}

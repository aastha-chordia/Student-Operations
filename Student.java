//Student.java

class Student{
	private String name;
	private int prn;
	private String branch;
	private String batch;
	private double cgpa;
	
	public Student(String name, int prn, String branch, String batch, double cgpa){
		setName(name);
		setPRN(prn);
		setBranch(branch);
		setBatch(batch);
		setCgpa(cgpa);
	}
	
	public String getName(){
		return name;
	}
	
	public int getPRN(){
		return prn;
	}
	public String getBranch(){
		return branch;
	}
	
	public String getBatch(){
		return batch;
	}
	public double getCgpa(){
		return cgpa;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setPRN(int prn){
		this.prn = prn;
	}
	
	public void setBranch(String branch){
		this.branch = branch;
	}
	
	public void setBatch(String batch){
		this.batch = batch;
	}
	public void setCgpa(double cgpa){
		this.cgpa = cgpa;
	}
	
	public void display(){
		System.out.println("Name: "+getName()+ " PRN: "+getPRN()+ " Branch: " +getBranch()+ " Batch: "+getBatch()+" CGPA: "+getCgpa());
	}
}
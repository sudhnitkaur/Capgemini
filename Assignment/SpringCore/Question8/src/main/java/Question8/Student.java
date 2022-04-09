package Question8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
	private int studentId;
	private String studentName;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void displayData() {
		System.out.println("Id : "+ studentId);
		System.out.println("Name : "+ studentName);
	}
	
	@PostConstruct
	public void initStudent() {
		System.out.println("Init Student");
	}
	
	@PreDestroy
	public void destroyStudent() {
		System.out.println("Destroy Student");
	}

}

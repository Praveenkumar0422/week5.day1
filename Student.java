package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("praveen");
	}
	public void studentDept() {
		System.out.println("CSE");
		
	}
	public void studentId() {
		System.out.println("id: CSE1001");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}

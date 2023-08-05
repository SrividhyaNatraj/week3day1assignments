package org.student;

import org.college.College;
import org.department.Department;

public class Student extends College {
	public Student(String studentName, String deptName , int studentId) {
		super(studentName, deptName, studentId);
		// TODO Auto-generated constructor stub
	}

	private String studentName;
    private String deptName;
    private int studentId;

  public String studentName() {
        return studentName;
    }

    public String deptName() {
        return deptName;
    }

    public int studentId() {
        return studentId;
    }
	
	    public static void main(String[] args) {
	        // Create College object
	        College college = new College("ABC College", "ABCCODE", 1);

	        // Create Department object
	        String deptName = "Computer Science"; // Assuming Computer Science department
	        Department department = new Department(deptName);

	        // Create Student object
	        String studentName = "John Doe";
	        int studentId = 12345;
	        Student student = new Student(studentName, deptName, studentId);

	        // Display information
	        System.out.println("College Name: " + college.collegeName());
	        System.out.println("College Code: " + college.collegeCode());
	        System.out.println("College Rank: " + college.collegeRank());

	        System.out.println("\nDepartment Name: " + department.deptName());

	        System.out.println("\nStudent Name: " + student.studentName());
	        System.out.println("Student ID: " + student.studentId());
	        System.out.println("Student Department: " + student.deptName());
	    }
	}
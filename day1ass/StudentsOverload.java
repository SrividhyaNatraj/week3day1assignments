package week3.day1ass;

public class StudentsOverload {
	public void  getStudentInfo(int id) {
		System.out.println("Student id:"+id);
	}
	public void  getStudentInfo(int id, String name) {
		System.out.println("Student id:"+id+",Student name:"+name);}
	
		public void  getStudentInfo(String email, String phoneNumber) {
			System.out.println("student Email: " + email + ", Phone Number: " + phoneNumber);
		}
		 public static void main(String[] args) {
		        StudentsOverload students = new StudentsOverload();

		        // Call the methods with different combinations of arguments
		        students.getStudentInfo(1);
		        students.getStudentInfo(2, "Srividhya");
		        students.getStudentInfo("srividhya@example.com", "1234567890");
	}
}

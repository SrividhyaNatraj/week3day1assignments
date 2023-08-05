package week3.day1ass;

public class Automation implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void python() {
		// TODO Auto-generated method stub
		System.out.println("python");
		
	}
	public void ruby() {
		// TODO Auto-generated method stub
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	public static void main(String[] args) {
		Automation automate=new Automation();
		automate.Selenium();
		automate.python();
		automate.ruby();
		automate.Java();
		
	}
}

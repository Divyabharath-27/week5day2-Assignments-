package w5d2assignment;

public class Automation extends MultipleLanguage implements Language,testTool{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println(" ruby");
		
	}
	public static void main(String[] args) {
		Automation obj =new Automation();
		obj.selenium();
		obj.java();
		obj.ruby();
		obj.python();
	}

}

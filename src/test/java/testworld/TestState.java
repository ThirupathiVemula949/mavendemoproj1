package testworld;

public class TestState {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Test");
//		String x = "Thirupathi vemula";
//		String y = "";
//		for (int i = x.length() - 1; i >= 0; i--) {
//			char c = x.charAt(i);
//			y = y + c;
//		}
//		System.out.println(y);
		
		int x = 12345;
		int y = 0;
		while(x>0) {
			int d=x%10;
			y=y*10+d;
			x=x/10;
			
		}
		System.out.println("Reverse NUmber: "+y);
	}

}

package testworld;

public class TestState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		String x = "Thirupathi vemula";
		String y = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			char c = x.charAt(i);
			y = y + c;
		}
		System.out.println(y);
	}

}

package conditon;

public class prime {
	public static void main(String[]args) {
		int num=50;
		boolean a=true;
		for(int j=2;j<20;j++) {
		for(int i=1;i<20;i++) {
			if(i % j==0) {
			System.out.println(i+"prime");
		}
		else {
			System.out.println(i+"not");
		}
		}
		}
	}

}

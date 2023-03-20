package conditon;

public class Mobilebrand {
	public static void main(String[]args) {
		String[] brand= {"honor","sony","samsung","infinix","xyz"};
		
		
		for(int i=0;i<brand.length;i++) {
			if(brand[i].contains("a")||brand[i].contains("e")||brand[i].contains("i")||brand[i].contains("o")||brand[i].contains("u")) {
				System.out.println(brand[i]);
			}
		}
	}

}

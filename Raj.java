package conditon;

public class Raj {
	public static void main(String[]args) {
		String[] animal= {"dog","tiger","lion","donkey"};
		int count=0;
		for(int i=0;i<=animal.length-1;i++) {
			if(animal[i].length()>=5) {
				count=count+1;
			}
		}
			System.out.println(count);
		
	}
	}


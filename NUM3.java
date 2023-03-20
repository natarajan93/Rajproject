package conditon;

public class NUM3 {
	public static void main(String[]args) {
		String[] a= {"freinds","bikes","car","classes","animals"};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].endsWith("s")) {
			count=count+1;	
			}
			}
				System.out.println("Plurals= "+count);
			
		
	}

}

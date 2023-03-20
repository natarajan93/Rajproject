package conditon;

public class NUM4 {
	public static void main(String[]args) {
		String[] a= {"RAJ","KUMAR","arun","apper"};	
		String b=a[0];
	
for(int i=0;i<a.length;i++) {
	if(a[i]==a[i].toUpperCase()) {
		
		System.out.println("Uppercase= "+a[i]);
		
	}
	else {
		System.out.println("Lowercase="+a[i]);
	}
	
}
}
}
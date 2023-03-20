package conditon;

public class NUM1 {
	public static void main(String[]args) {
		String[] a= {"apply","raj","apper","animal","kumar","a"};
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].startsWith("a")) {
				count=count+1;
			}
		}
		System.out.println(+count);
	}

}

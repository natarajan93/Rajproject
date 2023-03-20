package conditon;

public class Minimu {
	public static void main(String[]args) {
		String[] name= {"raej","kumar","deviit"};
		
		int max=name[0].length();
		String tem="";
		for(int i=0;i<name.length;i++) {
			if(name[i].length()<max) {
				max=name[i].length();
				tem=name[i];
			}
		}
		System.out.println("length=  mini= "+tem);
	}

}

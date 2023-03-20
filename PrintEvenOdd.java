package conditon;

public class PrintEvenOdd {
	public static void main(String[]args) {
	
	int[] num= new int[5];
	num[0]=1;
	num[1]=2;
	num[2]=7;
	num[3]=5;
	int eventotal=0;
	int oddtotal=0;
	
	for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			
			eventotal=eventotal+1;
		}
		else {
			oddtotal=oddtotal+1;
		}
	}
			System.out.println("even no "+eventotal+"odd no "+oddtotal);
		
		//else {
			
		//	oddtotal++;
		//	System.out.println("Odd no "+num[i]);
		}
	
	
	
	/*for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			System.out.println("even no "+num[i] );
		}
		else {
			System.out.println("Odd no "+num[i]);
		}
	
		}*/
	
	

	}


package unit14;

public class factorial {
	
	public static void main (String[]args){

//		int numberthing = 1;
//		for (int i = 10; i > 0; i--){
//			numberthing *= i;
//		}
//		System.out.println(numberthing);
		
		System.out.println(dofacts(10));
	}
	
	public static int dofacts(int x){		
		int done;
		
		if (x == 1){
			return 1;
		}
		
		done = dofacts(x-1) * x;
		return done;
	}
}
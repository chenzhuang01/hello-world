package nursery;

public class nursery {
	public static void main(String[] args) {
		int N=99;
		while(N>2) {
			System.out.println(N+" bottles of beer on the wall,"+N+" bottles of beer.\nTake one down.\nPass it around.\n"+(N-1)+" bottles of beer on the wall.");
		N=N-1;
		}
		if(N==2)
			System.out.println(N+" bottles of beer on the wall,"+N+" bottles of beer.\nTake one down.\nPass it around.\n"+(N-1)+" bottle of beer on the wall.");
		N=N-1;
		if(N==1)
			System.out.println(N+" botlte of beer on the wall,"+N+" bottle of beer.\nTake one down.\nPass it around.\nNo more bottles of beer on the wall.");
			
		//for(N=99;N>2;N--)
		//System.out.println(N+" bottles of the beer on the wall,"+N+" bottles of beer.\nTake on down.\nPass it around.\n"+(N-1)+" botltes of beer on the wall.");
		//if(N==2)
				//		System.out.println(N+" bottles of beer on the wall,"+N+" bottles of beer.\nTake one down.\nPass it around.\n"+(N-1)+" bottle of beer on the wall.");
		// N=N-1;
		//  if(N==1)
		// System.out.println(N+" botlte of beer on the wall,"+N+" bottle of beer.\nTake one down.\nPass it around.\nNo more bottles of beer on the wall.");
	
	//do {
		//System.out.println(N+" bottles of the beer on the wall,"+N+" bottles of beer.\nTake on down.\nPass it around.\n"+(N-1)+" botltes of beer on the wall.");
	//}while(N>2);
	//if(N==2)
		//System.out.println(N+" bottles of beer on the wall,"+N+" bottles of beer.\nTake one down.\nPass it around.\n"+(N-1)+" bottle of beer on the wall.");
  //N=N-1;
  //if(N==1)
	//  System.out.println(N+" botlte of beer on the wall,"+N+" bottle of beer.\nTake one down.\nPass it around.\nNo more bottles of beer on the wall.");
	
	
	}

}

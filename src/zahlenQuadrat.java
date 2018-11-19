
public class zahlenQuadrat {

	
	static long Ergebnis;
	
	
	public static void main(String[] args) {

		int x = 100;
		int y = 100;
		
		System.out.println(rechnen(x,y));
		

	}
	
	
	public static long rechnen(int col, int row) {		
		
		
	//	System.out.print(col+","+row);
	//	System.out.println(" "+Ergebnis+" 1")
		
		if(col>1 && row>1) {rechnen(col-1, row);
							rechnen(col, row-1);
							rechnen(col-1, row-1);}
	
		if(col==1 || row==1) {Ergebnis = Ergebnis + 1;}
		
		
		System.out.print(col+","+row);
		System.out.println(" "+Ergebnis);

		
		
		return Ergebnis;
		
		
	}
		
}

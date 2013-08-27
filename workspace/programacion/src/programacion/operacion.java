package programacion;

public class operacion {
	int x,y;
	public static void	main (String m[]){
		operacion t=new operacion();
		t.x=7;
		t.y=8;
		t.suma();
		t.resta();
		t.multiplicacion();
		t.division();
		
	}
		public void suma () {
			int r;
			r=x+y;
			System.out.println("la suma es"+r);
		
		}
			public void resta () {
				int f;
				f=x-y;
				System.out.println("la resta es"+f);			
			
		}

			public void multiplicacion () {
				int h;
				h=x*y;
				System.out.println("la multiplicacion es"+h);			
			
		}
	
			public void division () {
				int d;
				d=x/y;
				System.out.println("la division es"+d);			
			
		}
	
  
}
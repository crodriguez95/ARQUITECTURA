package taller;


public class formato {  
	 int edad;
  String  sexo;
  String nombre,numtelfo;
	
	formato (int edad,String nombre){
		this.edad=edad;
		this.nombre=nombre;
		}
		
	
	formato (int edad, String nombre,String sexo){
		this.edad=edad;
		this.nombre=nombre;
		this.sexo=sexo;
	}
	
	String comprobar (){
		if (edad>=18)
			return "mayor";
		else 
			return "menor";
	}
		public static void main(String a [ ]) {
			formato f= new formato (25,"diego");
			System.out.println(f.comprobar());
		
		
	}
	String recibir(){
		if (edad==7)
			return "niño";
		return nombre;
	
	
	}
	 public static void main1 (String s []){
		 formato y= new formato ()
	 }
	
	
	
	
	
	
	
	
}

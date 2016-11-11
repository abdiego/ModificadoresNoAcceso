package com.diego.tallerjava;
/**
 * 
 * @author Diego
 * Metodo final 
 */
public class MetFinal {
	
	private String serie1 = "The walking dead";
	private String serie2 = "Stranger things";
	private String serie3 = "Juegos Mentales";
	
	public final void peliculas()
	{
		System.out.print(""+serie1+"\n"+serie2+"\n"+serie3+"");
	}
	
	public static void main(){
		MetFinal p = new MetFinal();
		p.peliculas();
	}

}

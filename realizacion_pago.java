// package Pago en línea;

import java.util.*;


public class realizacion_pago{

    private int total;
    
	private realizacion_pago(int total){
	this.total = total;
	
	}
	

	
    public int gettotal() {
        
        return total;
    }

    
    public void settotal(int total) {
        this.total = total;
    }

    
	
	public static void main (String[] args){
		
		int total;
		realizacion_pago nuevaClase[] = new realizacion_pago[2];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingresa el total a pagar: ");
		total = sc.nextInt();
		
		
		System.out.println("TOKEN GENERADO:: AFYHG68KDJ");
			
		System.out.println("ID ORDEN:: 3457786");
		
		
		
		System.out.println("BIENVENIDO A CONEKTA");
	}	
}
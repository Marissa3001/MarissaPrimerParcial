// package Pago en línea;

import java.util.*;

/**
 * 
 */
public class Ingreso_tarjeta {

    private int digitos_tarjeta;
    private int cvv_tarjeta;
	private int vencimiento_tarjeta;
 
	
	private Ingreso_tarjeta(int digitos_tarjeta, int cvv_tarjeta, int vencimiento_tarjeta){
	this.digitos_tarjeta = digitos_tarjeta;
	this.cvv_tarjeta = cvv_tarjeta;
	this.vencimiento_tarjeta = vencimiento_tarjeta;
	}
    

    
    public  int getdigitos_tarjeta() {
        return digitos_tarjeta;
    }


    public int getvencimiento_tarjeta() {
        return vencimiento_tarjeta;
    }
	
	
    public int getcvv_tarjeta() {
		return cvv_tarjeta;
    }

    
    public void setdigitos_tarjeta(int digitos_tarjeta ) {
        this.digitos_tarjeta = digitos_tarjeta;
    }

     
    public void setvencimiento_tarjeta(int vencimiento_tarjeta ) {
		this.vencimiento_tarjeta = vencimiento_tarjeta;
    }

  
    public void setcvv_tarjeta(int cvv_tarjeta) {
        this.cvv_tarjeta = cvv_tarjeta;
    }

   public static void main (String[] args){
		
		int digitos_tarjeta, cvv_tarjeta, vencimiento_tarjeta;
		Ingreso_tarjeta nuevaClase[] = new Ingreso_tarjeta[2];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingresa tu numero de tarjeta:");
		digitos_tarjeta = sc.nextInt();
		
		System.out.println("Ingresa el vencimiento de tu tarjeta:");
		vencimiento_tarjeta = sc.nextInt();
		
		System.out.println("Ingresa el CVV de tu tarjeta:");
		cvv_tarjeta = sc.nextInt();
	}	
}
   
   
   
   
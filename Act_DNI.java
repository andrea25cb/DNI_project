package trabajos_programacion_def;

import java.util.Scanner;

public class Act_DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//comprobar si el último carácter es o no una letra
		
	Scanner teclado = new Scanner (System.in);	
	System.out.println("DNI: ");
	
	String dni = teclado.next(); 
	
	//Para que la letra sea solo en mayuscula:
	
	
		if (dni.length() == 8){
			boolean isLetter = (dni.charAt(8) >= 'A' && dni.charAt(8)<= 'Z');
			
		if (isLetter)
			System.out.println("it is ok");
		else 
			System.out.println("Last character must be a letter");
	}else
			System.out.println("Check your DNI number (number of digits)");
		
	}

}

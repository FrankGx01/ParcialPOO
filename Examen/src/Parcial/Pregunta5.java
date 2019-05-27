package Parcial;
import java.util.Scanner;
public class Pregunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduzca una cadena de texto : ");
		String sPalabra=lector.nextLine();
		int inc = 0;
		int des = sPalabra.length()-1;
		boolean bError = false;
		while ((inc<des) && (!bError)){
			 
			if (sPalabra.charAt(inc)==sPalabra.charAt(des)){				
				inc++;
				des--;
			} else {
				bError = true;
			}
		}
		if (!bError)
			System.out.println(sPalabra + " es un PALINDROMO");
		else
			System.out.println(sPalabra + " no es un palindromo");

	}

}

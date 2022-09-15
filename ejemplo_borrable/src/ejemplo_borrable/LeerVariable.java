/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_borrable;

/**
 *
 * @author Usuario
 */
import java.io.*;

public class LeerVariable {
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
	//Método para leer cadenas de texto
	

public static String leerTexto(String mensaje)
	{
		String texto = "";
		try 		{
			System.out.print(mensaje);
			texto = br.readLine();
		}
		catch (Exception e) 		{
			System.out.println("Error " + e);
		}
		return texto;
	}

	//Método para leer números enteros
        
	public static int leerEntero(String mensaje) 	{
		int num = 0;
		try 		{
			System.out.print(mensaje);
			num = Integer.parseInt(br.readLine());
		}
		catch (Exception e) 	{
			System.out.println("Error " + e);
		}
		return num;
	}

	//Método para leer números reales
	public static double leerReal(String mensaje)
	{
		double num = 0;
		try	{
			System.out.print(mensaje);
			Double d = new Double(br.readLine());
			num = d.doubleValue();
		}
		catch (Exception e) 		{
			System.out.println("Error " + e);
		}
		return num;
	} 
}

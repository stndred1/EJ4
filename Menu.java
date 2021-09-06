/**
* @author Edgar ++
* @file Parking.java
*
*/

import java.util.Scanner;

public class Menu {
	
	Parkingspace PS;
	public static Scanner scan;
	public static int opt;
	
		public Menu(){
		
			opt = 0;
			PS = new Parkingspace();
			
		}
		
		public static void menu(){
			
				while (opt != 5){
				System.out.println("********************************************************************************************* \n");
				System.out.println("Bienvenido Operador, Que deseas hacer?");
				System.out.println("1. Ingreso de un nevo carro.\n");
				System.out.println("2. Sacar un carro.\n");
				System.out.println("3. Agregar mas parqueos.\n");
				System.out.println("4. Estadisticas.\n");
				System.out.println("5. Cerrar programa.\n");
				System.out.println("********************************************************************************************* \n");
				
				try{
					
				scan = new Scanner(System.in);
				opt = scan.nextInt();		
			
				 if (opt == 1){

					System.out.println("Ingresar un carro");
					Parking.Addcar(Parkingspace PS);
				 }
				 
				 if (opt == 2){
					 
					System.out.println("Sacar un carro");
					Parking.carout(Parkingspace PS); 
				 }
				 
				 if (opt == 3){
					 
					 System.out.println("Aggregar mas carros");
					 Parking.Addspace(Parkingspace PS);
				 }
				 
				 if (opt == 4){
					 
					 System.out.println("Estadisticas del parqueo");
					 
				 }
				 
				 if (opt == 5){
					 
					 System.out.println("Gracias por su tiempo");
					 System.exit(0);
					 
				 }
				 
				}			
			 
			 catch(Exception e){
				 
				 System.out.println("Por favor, elija una opcion correcta.");
				 
				}
			 
			}
			 
	}
	
}
/**
* @author Edgar ++
* @file Parking.java
*
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Parking {
	
	Scanner Scan;
	private int Ingress;
	private int Outgress;
	private int hours;
	private String Make;
	private String Model;
	private String Plate;
	private String Size;
	private double price;
	Parkingspace PS = new Parkingspace();
	
		public Parking(Parkingspace PS){
			
			int hours = o;
			
			
		}
		
		public void AddSpace(){
			
			Scan = new Scanner(System.in);
			int num = 0;
			num = Scan.nextInt();
			System.out.println("Cuantos Parqueos deseas agregar?");
			
		}
		
		public void Addcar(Parkingspace PS){
			
			Scan = new Scanner(System.in);
			Integer Ingress = 0;
			String[] Car = new String[4];
			Integer[] Car1 = new Integer[1];
			
			
			System.out.println("Ingrese la placa del carro");
			Plate = Scan.nextLine();
			Plate = Car[0];
			System.out.println("Ingrese la marca del carro");
			Make = Scan.nextLine();
			Make = Car[1];
			System.out.println("Ingrese el modelo del carro");
			Model = Scan.nextLine();
			Model = Car[2];
			System.out.println("De que tamano es el carro? compound, Standard o de un carro Large?");
			Size = Scan.nextLine();
			
				if (Size == "compound"){
					
					for (String element : Space){
						
						if (Space[0] = "Medium" ^ "Small" ){
							
							Size = Car[3];
							System.out.println("Ingrese la hora de ingreso");
							Ingress = Scan.nextInt();
							Ingress = Car1[0];
							PS.Carinfo.carinfo.add(Car);
							PS.Carinfo.car1.add(Ingress);
							
						}
						
						else if (Space[0] != "Medium" ^ "Small"){
							
							System.out.println("No hay espacio. Profavor trate de nuevo mas tarde.");
			
							}
			
						}
				
					}
					
					if (Size == "standard"){
					
					for (String element : Space){
						
						if (Space[0] = "Medium" ^ "Large" ){
							
							Size = Car[3];
							System.out.println("Ingrese la hora de ingreso");
							Ingress = Scan.nextInt();
							Ingress = Car1[0];
							PS.carinfo.add(Car);
							PS.car1.add(Ingress);
							
						}
						
						else if (Space[0] != "Medium" ^ "Large"){
							
							System.out.println("No hay espacio. Profavor trate de nuevo mas tarde.");
			
							}
			
						}
				
					}
					
					if (Size == "large"){
					
					for (String element : Space){
						
						if (Space[0] = "Large" ){
							
							Size = Car[3];
							System.out.println("Ingrese la hora de ingreso");
							Ingress = Scan.nextInt();
							Ingress = Car1[0];
							PS.carinfo.add(Car);
							PScar1.add(Ingress);
							
						}
						
						else if (Space[0] != "Large"){
							
							System.out.println("No hay espacio. Profavor trate de nuevo mas tarde.");
			
							}
			
						}
				
					}
					
		}
		
		public void carout(Parkingspace PS){
			
			System.out.println("Ingrese la placa del carro");
			Plate = Scan.nextLine();
			for (String element : carinfo){
				if (PS.Carifo.find(Plate) = true){
					
					System.out.println("Ingrese la hora de salida");
					Outgress = Scan.nextInt();
					System.out.println("Ingrese las horas de estacionamento");
					hours = Scan.nextInt();
					price = 20 * hours;
					System.out.println("El costo del parqueo es Q" + price + ".");
					PS.carinfo.remove(Plate);

				}
			
				else if (PS.Carinfo.find(Plate) = false){
					
					System.out.println("El carro no se encuentra en el parqueo. Porfavor trate de nuevo");
				
				}
				
				}
				
		}
		
		
		public void addSpace(Parkingspace PS){
				
						
				System.out.println("El parqueo tiene techo?");
				if (Scan.nextLine() == "no"){
							
					Parkingspace ps = new Parkingspace();
					ps.Space[0] = "No Roof";
					System.out.println("De que tamano es el parqueo?");
					Size = Scan.nextLine() = ps.Space[1];
							
					}
						
				else if (Scan.nextLine() == "si"){
					
					Parkingspace ps = new ParkingSpace();
					System.out.println("De que tamano es el parqueo?");
					Size = Scan.nextLine() = ps.Space[1];
						
				}
				

	}
	
}			




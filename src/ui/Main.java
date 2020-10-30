package ui;
import java.util.Scanner;
import model.VaccinationCenter;

public class Main{
	private  Scanner lector;
	public VaccinationCenter center;

	public  Main() {
		lector= new Scanner(System.in);
		center = new VaccinationCenter();
	}	

	public static void main(String[] args) {
		System.out.println("******** Starting  *********");
		Main ppal= new Main();

		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);

	}

	public int showMenu() {
		int option=0;

		System.out.println(
			"Selec one option to start\n" +
			"(1) Crear pacientes\n" +
			"(2) Mostrar cantidad de pacientes \n"+
			"(3) Informacion por paciente\n"+
			"(4) Informacion del centro\n" +  
			"(0) Para salir"
			);
		option= lector.nextInt();
		lector.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
			case 0:
			System.out.println("Bye!");
			break;
			case 1:
			createPatient();
			
			break;
			case 2:
			System.out.println(center.showTotalPatients());

			break;
			case 3:
			System.out.println("Ingrese el nombre del paciente");
		String name = lector.nextLine();
		System.out.println(center.showPatients(name));	
			
			break;
			case 4:
			System.out.println(center.showInfo());
			
			break;
			default:
			System.out.println("Error, opción no válida");
		}
	}


	private void createPatient(){
		System.out.println("Escriba el nombre del paciente:");
		String name = lector.nextLine();
		System.out.println("Escriba el apellido del paciente:");
		String lastname = lector.nextLine();
		System.out.println("Numero de identificacion del paciente:");
		String id =lector.nextLine();
		System.out.println("Edad del paciente:");
		int age = lector.nextInt();
		System.out.println("Ingrese (1) para particular, (2) para EPS (3) Medicina prepagada");
		int option = lector.nextInt();lector.nextLine();

		switch(option){
			
			case 1 :{
				System.out.println("Telefono de contacto:");
				String cellphone=lector.nextLine();
				System.out.println("Medico tratante");
				System.out.println("Nombre");
				String nameDoctor=lector.nextLine();
				System.out.println("Telefono de contacto del medico:");
				String cellphoneDoctor=lector.nextLine();
				System.out.println("Numero de licencia del medico:");
				String license=lector.nextLine();
				String message=center.addPatient(name,lastname, id, age, cellphone,nameDoctor, cellphoneDoctor,license);
				System.out.println(message);
			}
			
			break;
			case 2 :
			{
				System.out.println("Nombre de EPS");
				String nameEps=lector.nextLine();
				System.out.println("Numero de orden");
				String orderEps=lector.nextLine();
				String message=center.addPatient(name,lastname, id, age,nameEps,orderEps);
				System.out.println(message);
			}
			break;
			case 3 :
			{
				System.out.println("Numero de afiliacion");
				String membership =lector.nextLine();
				System.out.println("1.Coomeva, 2.Sura, 3.Otra entidad");
				int prepaid = lector.nextInt();lector.nextLine();

				switch(prepaid){
					case 1:{
						System.out.println("Categora:PLATINUM, GOLD, GOLDPLUS");
						String category=lector.nextLine().toUpperCase();
						String message = center.addPatient(name, lastname, age, id,membership, category);
						System.out.println(message);
					}
					break;
					case 2:{
						System.out.println("Ingrese el valor minimo de la poliza");
						double minimum = lector.nextDouble();
						System.out.println("Ingrese el valor maximo de la poliza");
						double maximum = lector.nextDouble();
						String message = center.addPatient(name, lastname, age, id,membership, minimum, maximum);
						System.out.println(message);
					}
					break;
					case 3:{
						System.out.println("Nombre de la entidad");
						String nameEntity=lector.nextLine();
						System.out.println("Telefono de la entidad");
						String phoneEntity=lector.nextLine();
						String message = center.addPatient(name, lastname, age, id,membership, nameEntity, phoneEntity);
						System.out.println(message);

					}
					break;

				}

			}
			break;
			default:
			System.out.println("Error, invalid option");
		}

	}






}
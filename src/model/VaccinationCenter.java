package model;
public class VaccinationCenter {
	private static int MAX_PATIENTS=300;

	//Relations
	private Patient[] patients;
	
	public VaccinationCenter (){
		this.patients = new Patient[MAX_PATIENTS];
	} 



//Methods

     public Patient findPatient (String name){
		Patient objSearch=null;
		boolean findPa=false;
		for (int i=0;i<MAX_PATIENTS && !findPa;i++){
			if (patients[i]!=null && patients[i].getName().equalsIgnoreCase(name)){
				objSearch=patients[i];
				findPa=true;	
			}
		}
		return objSearch;
	}
	public String addPatient(String name,String lastName, String id, int age, String cellphone,String nameDoctor, String cellphoneDoctor,String license){
		String message = "El paciente fue agregado exitosamente";
		boolean added = false;
		Patient objSearch=findPatient(name);
		if (objSearch==null){
			
			for(int i=0; i<MAX_PATIENTS && !added; i++) {
				if(patients[i] == null) {
					patients[i] = new ParticularPatient(name, lastName, age, id, nameDoctor, cellphoneDoctor, license);
					added = true;
				}
			}
			if(added = false) {
				message = "No hay mas espacio";
			}
		}
		else 
			message=("El paciente ya existe");

		return message;
	}


	public String addPatient(String name, String lastname, String  id,int age,String nameEps,String orderEps){
		String message="El paciente fue agregado";
		boolean added=false;
		Patient objSearch=findPatient(name);
		if (objSearch==null){
			for(int i=0; i<MAX_PATIENTS && !added; i++) {
				if(patients[i] == null) {
					patients[i] = new EpsPatient(name,lastname, id, age,nameEps,orderEps);
					added = true;
				}
			}
			if(added = false) {
				message = "No hay mas espacio";
			}
		}
		else 
			message=("El paciente ya existe");

		return message;

	}
	

	public String addPatient (String name, String lastname, int age, String id, String membership, String category){
			String message="El paciente fue agregado";
		boolean added=false;
		Patient objSearch=findPatient(name);
		if (objSearch==null){
			for(int i=0; i<MAX_PATIENTS && !added; i++) {
				if(patients[i] == null) {
					patients[i] = new CoomevaPatient(name, lastname, age, id,membership, category);
					added = true;
				}
			}
			if(added = false) {
				message = "No hay mas espacio";
			}
		}
		else 
			message=("El paciente ya existe");

		return message;
	}


   public String addPatient (String name, String lastname, int age, String id,String membership, double minimum, double maximum){
   			String message="El paciente fue agregado";
		boolean added=false;
		Patient objSearch=findPatient(name);
		if (objSearch==null){
			for(int i=0; i<MAX_PATIENTS && !added; i++) {
				if(patients[i] == null) {
					patients[i] = new SuraPatient(name, lastname, age, id,membership, minimum, maximum);
					added = true;
				}
			}
			if(added = false) {
				message = "No hay mas espacio";
			}
		}
		else 
			message=("El paciente ya existe");

		return message;
   }


   public String addPatient (String name, String lastname,int  age, String id,String membership, String nameEntity,String phoneEntity){
		String message="El paciente fue agregado";
		boolean added=false;
		Patient objSearch=findPatient(name);
		if (objSearch==null){
			for(int i=0; i<MAX_PATIENTS && !added; i++) {
				if(patients[i] == null) {
					patients[i] = new OtherEntity(name, lastname, age, id,membership, nameEntity,phoneEntity);
					added = true;
				}
			}
			if(added = false) {
				message = "No hay mas espacio";
			}
		}
		else 
			message=("El paciente ya existe");

		return message;
   }


   public String showTotalPatients() {
		int contParticular = 0;
		int contEps = 0;
		int contPrepaid = 0;
		int contCoomeva = 0;
		int contSura = 0;
		int contOtherEntity = 0;
		String message = "";
		for(int i=0; i<MAX_PATIENTS; i++) {
			if(patients[i] != null) {
				if(patients[i] instanceof ParticularPatient){
					contParticular++;
				}
				else if(patients[i] instanceof EpsPatient){
					contEps++;
				}
				else if(patients[i] instanceof CoomevaPatient){
					contCoomeva++;
					contPrepaid++;
				
				}
				else if(patients[i] instanceof SuraPatient){
					contSura++;
					contPrepaid++;
				}
				else if(patients[i] instanceof OtherEntity){
					contOtherEntity++;
					contPrepaid++;
				}
			}
		}
		
		int contCenter = contParticular+contEps+contPrepaid;
		message += "Pacientes registrados en el centro: "+contCenter+"\n"+"Pacientes particulares "+contParticular+"\n"+"Pacientes de EPS "+contEps+"\n"+"Pacientes prepagados "+contPrepaid+"\n";
		message += "Pacientes de Coomeva "+contCoomeva+"\n"+"Pacientes de SURA "+contSura+"\n"+"Pacientes de otras entidades "+contOtherEntity+"\n";
		return message;
	}


	public String showPatients(String name){
		Patient objsearch = findPatient(name);
		String message = objsearch.toString();

	return message;
	}
	public String showInfo(){
		String message = "";
		message += showTotalPatients();
		for(int i = 0; i<MAX_PATIENTS; i++){

			if(patients[i] != null){
				message += patients[i].toString();

			}
		}
		return message;
	}


}
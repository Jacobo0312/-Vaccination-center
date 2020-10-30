package model;
public class ParticularPatient extends Patient{
	private int contactPhone;
	private String nameDoctor;
	private String cellphoneDoctor;
	private String license;
	
	public ParticularPatient (String name, String lastName, int age, String id, String  nameDoctor, String cellphoneDoctor, String license){
		super(name,lastName, age, id);
		this.nameDoctor=nameDoctor;
		this.cellphoneDoctor=cellphoneDoctor;
		this.license=license;
		
	}

		public String toString(){
			String message = "";
			message = super.toString();
			
			message += "\n **********Paciente particular***********" +
		    "\n nombre del doctor: " + nameDoctor +
		    "\n telefono del doctor: " + cellphoneDoctor + 
		    "\n numero de licencia: " + license + 
			"\n ***************************************************";
			return message;
	}

}
package model;
public class CoomevaPatient extends PrepaidMedicine{

	//Atributes 
	private CoomevaCategorie category;
	

	public CoomevaPatient(String name, String lastname, int age, String id, String membership, String category){
		super( name,  lastname,  age,  id,  membership);
		this.category=CoomevaCategorie.valueOf(category);;
		
	}

		public String toString(){

			String message = "";
			message = super.toString();

			message += "\n **********Paciente de Coomeva***********" +
		    "\n Categoria : " + category +
		     
			"\n ***************************************************";
			return message;
	}


}
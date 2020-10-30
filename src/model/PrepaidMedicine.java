package model;
public class PrepaidMedicine extends Patient{

	//Atributes 

	private String membership;

	
	public PrepaidMedicine(String name, String lastname, int age, String id,String membership){
		super(name,lastname,age,id);
		this.membership=membership;
		

	}
	public String getMembership(){
		return this.membership;
	}
	public void setMembership(String membership){
		this.membership=membership;
	}

		public String toString(){

			String message ="";
			message = super.toString();
			message += "\n **********Prepagada***********" +
		    "\n numero de membresia : " + membership +
			"\n ***************************************************";
			return message;
	}
}
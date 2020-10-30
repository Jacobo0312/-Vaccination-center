package model;
public class EpsPatient extends Patient{
	private String nameEps;
	private String orderEps;
	
	public EpsPatient(String name, String lastName, String  id,int age,String nameEps,String orderEps){
	super( name,lastName,age,id);
		this.orderEps=orderEps;
		this.nameEps=nameEps;
		
	}
	public String getNameEps(){
		return this.nameEps;
	}
	public void setNameEps(String nameEps){
		this.nameEps=nameEps;
	}
	public String getOrderEps(){
		return this.orderEps;
	}
	public void setOrderEps(String orderEps){
		this.orderEps=orderEps;
	}


		public String toString(){

			String message = "";
			message = "\n **********Paciente de EPS***********" +
		    "\n nombre de la EPS: " + nameEps +
		    "\n numero de orden: " + orderEps + 
			"\n ***************************************************";
			return message;
	}
}
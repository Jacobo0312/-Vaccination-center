package model;
public class SuraPatient extends PrepaidMedicine{

	//Atributes 

	private double minimum;
	private double maximum;

	public SuraPatient(String name, String lastname, int age, String id,String membership, double minimum, double maximum){
		super( name,lastname, age, id, membership);
		this.minimum=minimum;
		this.maximum=maximum;
		

		
	}
	public double getMinimum(){
		return this.minimum;
	}
	public void setMinimumValue(double minimum){
		this.minimum=minimum;
	}
	public double getMaximumValue(){
		return this.maximum;
	}
	public void setMaximumValue(double maximum){
		this.maximum=maximum;
	}

		public String toString(){

			String message = "";
			message = super.toString();

			message += "\n **********Paciente particular***********" +
		    "\n valor minimo: " + minimum+
		    "\n valor maximo: " + maximum + 
			"\n ***************************************************";
			return message;
	}
}
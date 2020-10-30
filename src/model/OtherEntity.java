package model;
public class OtherEntity extends PrepaidMedicine{
	//Atributes 

	private String nameEntity;
	private String phoneEntity;
	public OtherEntity(String name, String lastname,int  age, String id,String membership, String nameEntity,String phoneEntity){
		super(name,lastname,age,id,membership);
		this.nameEntity=nameEntity;
		this.phoneEntity=phoneEntity;
    
	}

	public String getNameEntity(){
		return this.nameEntity;
	}
	public void setEntityName(String nameEntity){
		this.nameEntity=nameEntity;
	}
	public String getPhoneEntity(){
		return this.phoneEntity;
	}
	public void setphone(String phoneEntity){
		this.phoneEntity=phoneEntity;
	}

		public String toString(){

			String message = "";
			message = super.toString();
			message += "\n **********Otras entidades***********" +
		    "\n nombre de la entidad : " + nameEntity +
		    "\n telefono de la entidad: " + phoneEntity +	     
			"\n ***************************************************";
			return message;
	}
}
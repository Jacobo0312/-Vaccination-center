package model;
public class  Patient {

			
		private String name;
		private String lastName; 
		private int age;
		private String id;

		//Relationship

		public Patient(String name, String lastName, int age, String id){
			this.name=name;
			this.lastName=lastName;
			this.age=age;
			this.id=id;
		}
		public String getName(){
			return this.name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getLastName(){
			return this.lastName;
		}
		public void setLastName(String lastName){
			this.lastName=lastName;
		}
			public int getAge(){
			return this.age;
		}
		public void setAge(int age){
			this.age=age;
		}
			public String getId(){
			return this.id;
		}
		public void setId(String id){
			this.id=id;
		}


		public String toString(){

			String message = "";
			message = "\n ********** Patient ***********" +
		    "\n nombre del paciente: " + name +
		    "\n Apellido  del paciente: " + lastName +  
			"\n Edad: " + age +
			"\n Identificacion: " + id +
			"\n *************************";
			return message;
		}
	
}
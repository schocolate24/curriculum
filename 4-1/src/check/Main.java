package check;

public class Main {
	
private String firstName = "Schoco ";
private String lastName = "Nakaki";


	

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}





	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.print("printName Method -> ");
		System.out.print(main.getFirstName());
		System.out.println(main.getLastName());
		
		Pet pet =  new Pet(constants.Constants.CHECK_CLASS_JAVA,constants.Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robo = new RobotPet(constants.Constants.CHECK_CLASS_R2D2,constants.Constants.CHECK_CLASS_LUKE);
		robo.introduce();
	
	}


}


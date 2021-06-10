package Vorlesungen.codebeispiele.predicatesexample;

public class Employee {

	private final Integer id;
	private final Integer age;
	private final String gender;
	private final String firstName;
	private String lastName;

	public Employee(Integer id, Integer age, String gender, String fName,
			String lName) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = fName;
		this.lastName = lName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}
//
//	@Override
//	public String toString() {
//		return "Employee [age=" + age + ", gender=" + gender + ", firstName="
//				+ firstName + ", lastName=" + lastName + "]";
//	}
	
	public String toString() {
        return this.id.toString()+" - "+this.age.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
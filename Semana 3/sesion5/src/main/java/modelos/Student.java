package modelos;

/**
 * @author diego
 * @version 1.0
 * @created 03-sep.-2024 17:51:19
 */
public class Student {

	private float average;
	private String career;
	private String cif;
	private String firstName;
	private String lastName;
	private boolean scholarship;

	public Student(){

	}

	public Student(float average, String career, String cif, String firstName, String lastName, boolean scholarship) {
		this.average = average;
		this.career = career;
		this.cif = cif;
		this.firstName = firstName;
		this.lastName = lastName;
		this.scholarship = scholarship;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

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

	public boolean isScholarship() {
		return scholarship;
	}

	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
}
//end Student

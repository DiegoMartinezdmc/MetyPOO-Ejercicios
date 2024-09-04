package modelos;

/**
 * @author diego
 * @version 1.0
 * @created 03-sep.-2024 17:51:22
 */
public class Admission {

	public Admission(){

	}

	/**
	 * calcula si el estudiante tiene derecho a beca
	 * @param student
	 */
	public void calcScholarship(Student student){
		student.setScholarship(student.getAverage()>=80);
	}
}
//end Admission

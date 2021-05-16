package dayThree;

public class Instructor extends User {
	
	private double instructorRate;
	
	public Instructor(int id, String firstName, String lastName, String userName, double instructorRate) {
		super(id, firstName, lastName, userName);
		this.instructorRate = instructorRate;
	}



	public double getInstructorRate() {
		return instructorRate;
	}

	public void setInstructorRate(double instructorRate) {
		this.instructorRate = instructorRate;
	}

}

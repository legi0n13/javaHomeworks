package dayThree;

public class Student extends User{
	
	private int userPoint;
	
	
	public Student(int id, String firstName, String lastName, String userName, int userPoint) {
		super(id, firstName, lastName, userName);
		this.userPoint = userPoint;
		// TODO Auto-generated constructor stub
	}



	public int getUserPoint() {
		return userPoint;
	}

	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	

}

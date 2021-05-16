package dayThree;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName()+ " isimli eðitmen "+ courseName+" kursunu ekledi.");
	}

}

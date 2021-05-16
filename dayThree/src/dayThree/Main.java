package dayThree;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"john","doe","@johndoe",4.5);
		System.out.println(instructor1.getFirstName());
		Student student1 = new Student(2, "ali", "ruhi", "@ali", 10);
		
		InstructorManager insManager = new InstructorManager();
		insManager.addCourse(instructor1, "Java/Spring");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addUserPoint(student1);

	}

}

package dayTwo;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java yaz�l�m geli�tirme","Engin Demiro�", "3000");
		Course course2 = new Course(2,"C# yaz�l�m geli�tirme","Engin Demiro�", "5000");
		Course course3 = new Course(3,"Sql yaz�l�m geli�tirme","Engin Demiro�", "1000");
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println("Kurs idsi: "+course.id+"    ��renci say�s�: "+course.studentNumber);
		}
		
		
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course3);

	}

}

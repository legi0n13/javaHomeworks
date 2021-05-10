package dayTwo;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java yazılım geliştirme","Engin Demiroğ", "3000");
		Course course2 = new Course(2,"C# yazılım geliştirme","Engin Demiroğ", "5000");
		Course course3 = new Course(3,"Sql yazılım geliştirme","Engin Demiroğ", "1000");
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println("Kurs idsi: "+course.id+"    Öğrenci sayısı: "+course.studentNumber);
		}
		
		
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course3);

	}

}

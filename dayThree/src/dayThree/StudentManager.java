package dayThree;

public class StudentManager extends UserManager{
	public void addUserPoint(Student student){
		//kullanýcýnýn dersi bitirdiði tespit edilir
		student.setUserPoint(1);
		System.out.println(student.getFirstName()+ " isimli kullanýcýya dersi bitirdiði için puan eklendi\nmevcut puan: "+student.getUserPoint());
	}
}

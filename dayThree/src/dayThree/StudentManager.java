package dayThree;

public class StudentManager extends UserManager{
	public void addUserPoint(Student student){
		//kullan�c�n�n dersi bitirdi�i tespit edilir
		student.setUserPoint(1);
		System.out.println(student.getFirstName()+ " isimli kullan�c�ya dersi bitirdi�i i�in puan eklendi\nmevcut puan: "+student.getUserPoint());
	}
}

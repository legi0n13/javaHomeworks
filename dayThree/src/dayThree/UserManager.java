package dayThree;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+ " isimli kullan�c� eklendi");
	}
	public void delete(User user) {
		
		System.out.println(user.getFirstName()+ " isimli kullan�c� silindi");
	}

}

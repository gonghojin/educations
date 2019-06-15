package creation.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Users orginUsers = new Users(null);
		orginUsers.loadData();

		Users cloneUsers = (Users) orginUsers.clone();

		if (orginUsers.getUserList() == cloneUsers.getUserList()) {
			System.out.println("shallow");
		} else {
			System.out.println("deep");
		}

		if (orginUsers == cloneUsers) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("복제된 객체");
		}
	}

}

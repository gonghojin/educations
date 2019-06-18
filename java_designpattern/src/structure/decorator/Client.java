package structure.decorator;

public class Client {

	public static void main(String[] args) {
		Cookie braveCookie = new CookieBrave();

		Cookie mikeCookie = new ToppingMilk(braveCookie);

		Cookie chocoCookie = new ToppingChocolate(mikeCookie);

		Cookie milkCookie2 = new ToppingMilk(chocoCookie);

		System.out.println(milkCookie2.getName());

		Cookie milkCookie3
				= new ToppingMilk(new ToppingChocolate(new ToppingMilk(new CookieBrave())));

		System.out.println(milkCookie3.getName());
	}

}

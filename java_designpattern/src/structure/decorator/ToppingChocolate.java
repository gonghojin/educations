package structure.decorator;


public class ToppingChocolate extends Topping{
    public ToppingChocolate(Cookie cookie) {
        super(cookie);
    }

    @Override
    public String getName() {
        return "초코맛 " + cookie.getName();
    }
}

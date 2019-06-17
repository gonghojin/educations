package structure.decorator;

public class ToppingMilk extends Topping {

    public ToppingMilk(Cookie cookie) {
        super(cookie);
    }

    @Override
    public String getName() {
        return "우유맛 " + cookie.getName();
    }
}

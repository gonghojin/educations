package structure.decorator;

// Decorator
public abstract class Topping implements Cookie {
    protected Cookie cookie;

    public Topping(Cookie cookie) {
        this.cookie = cookie;
    }
}

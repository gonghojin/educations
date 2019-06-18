package structure.composite;

/*
    Leaf

    File 클래스는 Node 인터페이스를 구현하면 끝,
    자신은 자식 요소를 가질 필요가 없기 때문
 */
public class File implements Node {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }
}

package structure.composite;

import java.util.ArrayList;
import java.util.List;

/*
    Composite

    Directory 클래스는 Node 인터페이스를 구현하는 것 외에도,
    자식 요소를 담아줄 List가 필요

 */
public class Directory implements Node{
    private String name;

    // File/Directory 모두 담김
    private List<Node> children;

    @Override
    public String getName() {
        return this.name;
    }

    public void add(Node node) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(node);

        System.out.println("Node 삽입");
    }
}

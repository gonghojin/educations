package structure.adapter;

import java.util.Enumeration;

// Adapter
public class EnumerationIterator implements AIterator {
    // adaptee, old code
    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}

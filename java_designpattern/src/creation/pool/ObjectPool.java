package creation.pool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool<T> {
    List<T> availablePool;
    List<T> inUsePool;

    private int maxPoolSize = 10;

    public ObjectPool(Class<T> classObj) throws Exception {
        createPool(classObj, this.maxPoolSize);
    }

    public ObjectPool(Class<T> classobj, int maxPoolSize) throws Exception {
        createPool(classobj, maxPoolSize);
    }

    private void createPool(Class<T> classObj, int maxPoolSize) throws Exception {
        this.maxPoolSize = maxPoolSize;

        this.availablePool = new ArrayList<>();
        this.inUsePool = new ArrayList<>();

        for (int i = 0; i < maxPoolSize; i++) {
            this.availablePool.add(classObj.newInstance());
        }
    }

    public T getObject() {
        if (this.availablePool.size() == 0) {
            throw new PoolSizeOutException("사용할 객체가 없습니다");
        }

        T instance = this.availablePool.get(0);
        availablePool.remove(0);
        inUsePool.add(instance);

        return instance;
    }

    public boolean invalidate(T obj) {
        for (T data : inUsePool) {
            if (data != null && data == obj) {
                return true;
            }
        }

        return false;
    }

    static class PoolSizeOutException extends RuntimeException {
        public PoolSizeOutException(String message) {
            super(message);
        }
    }
}


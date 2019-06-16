package creation.pool;

import com.sun.xml.internal.xsom.impl.scd.Step;

public class Client {
	public static void main(String[] args) throws Exception {
        ObjectPool<StringBuffer> pool = new ObjectPool<>(StringBuffer.class, 2);

        StringBuffer poolObj1 = pool.getObject();
        StringBuffer obj = new StringBuffer();

        // 결과 값 :  true, 즉 생성된 겍체가 재활용되고 있다.
        System.out.println(pool.invalidate(poolObj1));
        // 결과 값 : false
        System.out.println(pool.invalidate(obj));
	}

}

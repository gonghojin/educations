## 현재 Singleton 패턴의 문제점 및 보완
### 문제점
싱글 쓰레드에서는 문제가 없지만, 멀티 쓰레드에서는 문제 발생  
> Why?) 2개 이상 Thread에서 동시에 getInstance 호출 가능성이 존재  
---
### 보완
Synchronized singletons 사용  
> 동시 호출되지 않고 순차 처리되도록 `Blocking`  

+ 보완 1
    + getInstance 전체를 thread safe하게 설정
    ````java
     public static `synchronized` Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
    
            return instance;
    }    
   ````
+ 보완 2
    + null 체크 조건문에 thread safe하게 설정
     ````java
        public static Singleton getInstance() {
          synchronized(Singleton.class) {
            if (instance == null) {
               instance = new Singleton();
            }
          }  
          
          return instance;
       }    
    ````



보완 1, 2가 최선일까? 
> 아니오!!  
> Why?) 불필요하게 delay가 발생하기 떄문  
>       - instance가 이미 생성되어 있는 경우에도 Block하여 순차 처리하기 떄문  

보완 1, 2를 개선해보자!!  
보완 3 :
+ double-checked locking
    + 2번의 insance null check
    ````java
    public static Singleton getInstance() {
      if (instance == null) {
          synchronized (Singleton.class ) {
              if (instance == null) {
                  instance = new Singleton();  
              }  
          }  
      }
      
      return instance;
    }
    ````
   
----
보완 1~3처럼 Lock(Block)를 임의로 처리하지 않고 해결할 수는 없을까?
+ Lock-free thread-safe singleton
    ````java
      public class Singleton {
          // Java Static은 Class Load가 딱 한번만 일어남
          private static Singleton instance = new Singleton();
          
          public static synchronized Singleton getInstance() {
            return instance;
          }
      }
    ```` 
그러나 `보완 3`이 가장 좋은 방법이라고 한다.  
> Why?)   
> Lock-free thread-safe singleton은 초기 자바 버전에서는 Early loading.  
> 최신 자바 버전에서는 lazy loading. 즉, JVM에 의존되기 떄문에 좋은 구현 방법이 아님
> - 최신 자바 버전에는 모든 구현 방법이 lazy loding이므로  
> Early loading 필요 시, Application  시작 시 Singleton.getInstance()를 호출하도록 구현  

> Early and Lazy loading  
> + lazy loading: getInstance `호출 시 instance 생성`, 즉 필요 시 생성하여 메모리 효율화
# 생성 패턴
## 목차
+ Singleton pattern
+ Factory pattern
    + Simple factory pattern
    + Factory method pattern
    + Abstract factory pattern
+ Builder pattern
+ Prototype pattern
+ Object pool pattern

## Singleton pattern
+ 클래스에 `오직 하나의 객체만`이 생성됨을 보장
+ `오직 하나의 인스턴스만`을 생성하여 이를 접근하는 메소드를 제공

특정 객체를 인스턴스로 만드는 데 사용되는 방법
> 객체가 인스턴스로 이미 생성되었는지 체크  
> 그렇다면? 이미 만들어진 객체의 레퍼런스를 리턴  
> 그렇지 않다면? 객체를 만들고 그 객체의 레퍼런스를 리턴  
> 생성자는 protect 또는 private로 선언
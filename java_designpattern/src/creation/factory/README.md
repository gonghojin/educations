## Factory pattern
````java
Vehicle bike = new Bike();
Vehicle car = new Car();
````
위와 같이 객체를 생성한다면 어떤 문제가 있을까?
+ 개방/폐쇄 원칙 위반(open/closed principle)
    + 신규 class(Bike, Van)가 추가될 때마다 main code 수정이 필요
+ 단일 책임 원칙 위반(Single responsibility principle 위반)
    + Main Class가 Vehicle instance 생성의 책임을 진다.

> 그래서 필요한 것이 무엇?  
> '생성 책임을 `별도 객체로 분리`

### 목차
1. Simple Factory pattern(./simple) : 객체 생성을 별도로 위임
2. Factory method pattern(./method) : 객체 생성을 서브 클래스에 위임
    + Simple Factory 개선
        + factory class로 추상화
        + concrete(구성 클래스)에서 상세 제품 instance 생성코드 작성
    > 객체 생성을 서브 클래스에 위임  
3. Abstract factory pattern(./abstractf) : 의존 객체의 패밀리를 생성하기 위함
    + ConcreteFactory내에 여러 객체 생성

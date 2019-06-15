## Builder pattern
어떨 때 사용할까?
+ 생성 인자가 많을 경우
    + 생셩자의 복잡성
+ 객체 생성 로직을 클래스 밖으로 옮길 필요가 있을 때
+ 서로 연관된 복잡한 생성자를 가지고 있을 떄
+ 한번에 모든 생성 데이터가 없을 때
    + 단계적 생성


### 비교
> 점층적 생성자 패턴
~~~java
public class Member {
    private final String name; // 필수 인자
    private final String location; // 선택적 인자
    private final String hobby; // 선택적 인자
    
    // 필수 생성자
    public Member(String name) {
        this(name, "출신지역 비공개", "취미 비공개");
    }
    
    // 1개의 선택적 인자를 받는 생성자
    public Member(String name, String location) {
        this(name, location, "취미 비공개");
    }
    
    // 모든 선택적 인자를 다 받는 생성자
    public Member(String name, String location, String hobby) {
        this.name = name;
        this.locationm = location;
        this.hobby = hobby;
    }
}  
~~~
특징  : 인자가 추가되면 코드 수정이 어려움  

~~~java
NutritionFacts cocaCola = new NutritionFacts(240, 8, 100);
NutritionFacts pepsiCola = new NutritionFacts(222, 1);
NutritionFacts mountainDew = new NutritionFacts(230);
~~~
특징 :   
 + 호출 코드만으로 각 인자의 의미를 알기 어렵다.
 + 가독성이 떨어진다.

>자바빈 패턴
~~~java
NutritionFacts cocaCola = new NutritionFacts();
cocaCola.setServingsize(240);
cocaCola.setServings(8);
cocaCola.setCalories(100);
~~~
특징 :  
+ 1회 호출로 객체 생성이 끝나지 않음
    + 객체를 생성한 이후 값을 추가함으로써 객체 일관성이 꺠진다.
+ 변경 불가능 클래스가 되지 않음
    + 즉 객체 생성 이후에 변경이 가능함
    

이러한 점을 보완할 수 있는 것이 `Builder Pattern`
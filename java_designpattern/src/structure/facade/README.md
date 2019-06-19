## Facade pattern
> 복잡한 시스템을 쉽게 사용하는 방법  
> + 시스템의 부분집합을 사용
> + 시스템을 특정한 방법으로 사용  
>
> 클라이언트 객체가 다루어야 할 객체의 수를 줄여줌
>
> 새로운 기능을 추가하여 확장
> 
> 캡츌화 층: 시스템을 감추고 캡슐화  

> 퍼사드 패턴은 단순화된 인터페이스를 통해서 서브시스템을 더 쉽게 사용할 수 있도록 하기 위함
> + 어떤 서브시스템에 속한 복잡한 클래스들을 단순화하고 통합한 클래스를 만들어서 제공
> + 다른 패턴과 달리 퍼사드 패턴은 상당히 단순하며 복잡한 추상화와 같은 개념이 필요없다.
>
> 퍼사드 패턴을 사용하면 클라이언트와 서브시스템이 서로 긴밀하게 연결되지 않아도 된다.


#### Facade와 Adapter의 차이
둘다 wrapper이지만 미묘한 차이 존재

|                            |Facade|Adapter|
|--------------------------- :| ---- : |  ---- : |
| 이미 존재하는 클래스가 있는가?    |  YES| YES   |
| 인터페이스를 설계 해야 하나?     | NO   | YES  |
| 다형적으로 동작하는 객체가 필요한가?|NO|Probably|
| 더 간단한 인터페이스가 필요한가?|YES|NO|
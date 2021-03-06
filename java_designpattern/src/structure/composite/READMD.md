## Composite pattern
> 컴포지트: 개별이 될 수도 있고, 집합이 될 수도 있는 객체  
>   + 컴포지트 객체는  개별 아이템이나 복합체로 구성될 수 있음

#### Composite 구성
+ Component(./Node)
    + Component에서는 복합 객체 내에 들어있는 모든 객체에 대한 인터페이스를 정의한다.  
    + 복합 노드뿐만 아니라 잎 노드에 대한 메소드까지 정의하여 부분-전체를 다룬다.  
+ Leaf(./File)
    + Leaf에서는 그 안에 들어있는 원소에 대한 행동을 정의한다.
    + Leaf는 자식이 없는 개별 객체이며, Composite에서 지원하는 기능을 구현해야 한다.
+ Composite(./Directory)
    + Composite에서는 자식이 있는 구성요소의 행동을 정의하고 자식 구성요소를 저장하는 역할을 맡는다.
    + 부분-전체 구조를 다루어야 하므로 복합 객체뿐 아니라 개별 객체엔 Leaf와 관련된 기능도 구현해야 한다.
## Bridge pattern
> 추상을 구현으로부터 분리하여 독립적으로 변하게 함
> + 약결합을 통해 유연한 변경을 유도    
>
> 기능과 구현을 별도 클래스로 정의해서 분리  

#### Bridge 구성  
+ Abstraction / Refined: 추상층(./Weapon, ./Bow, ./Sword)
+ Implementation / Specificlmplementation: 구현층(./WeaponHandler, ./Warrior, ./Smith)    

Shape(추상 개념)과 Drawing(구현)이 분리되는데, `두 관계를 Bridge`라고 함  

#### 활용
+ 디바이스 드라이버(예: 프린터 드라이버)
    + 다양한 프린터의 타입에 대한 변화
    + 특정 하드웨어를 위한 다양한 구현
+ JDBC
    + Java SQL DB 드라이
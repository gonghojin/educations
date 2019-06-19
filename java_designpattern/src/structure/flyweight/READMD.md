## Flyweight pattern
> 수많은 작은 객체를 생성하여야 할 때  
> 사용되는 많은 객체를 생성 관리하는 객체를 따로 두어, 이를 통해 필요한 객체를 참조형태로 사용하도록  
> 본질적인 것과 부가적인 것을 구분하려 할 때 사용함  


#### Flyweight pattern 구성
+ Flyweight(CharacterShare)
+ FlyweightFactory: flyweights 생성.
    + pool을 사용하여 이미 존재시 생성된 flyweights 반환  
+ ConcreteShareableFlyweight(SoliderShare, TankShare, PlaneShare)  
    + 공유될 수 있는 객체 표현, intrinsic data(공유될 수 있는 data)를 보관
    > flyweight 객체들의  state를 intrinsic(공유가능)과 extrinsic(공유불가능)으로 분류한다.    
    Intrinsic state는 공유되는 ConcreteFlyweight 객체에 보관된다.  
    Extrinsic state는 Client에서 보관되거나 계산된다.  
    Client는 직접적으로 ConcreteFlyweight 객체를 생성하지 않고, FlyweightFactory 객체를 통하여 공유객체를 생성한다.

예제 설명
+ 전략 시뮬레이션 게임에서 수 백개의 병사, 전차, 비행기 등의 캐릭터를 동시에 실행  
    + 수 백 개 이상이 되는 많은 캐릭터들이 성능이 뒤떨어진 컴퓨터에서도 어떻게 설계해야 무리없이 병렬적으로 동작을 할 것인가?  
        + 캐릭터 객체의 모든 정보를 공유할 순 없지만, 공유할 수 있는 정보를 외부 객체로 만들고 이를 공유  

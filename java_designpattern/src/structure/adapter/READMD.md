## Adapter pattern
> 클래스의 인터페이스를 `클라이언트`가 원하는 대로 변경  
>
> Adapter는 호환 불가능한 인터페이스 때문에 협력할 수 없는 클래스들을 협력할 수 있게 함  
>
> Wrapper(래퍼)라고도 불림  
>
> 레거시 시스템을 원하는 인터페이스로 사용가능케 함

#### Adapter Pattern의 구성
+ Adaptee: old code(./Enumeration)
+ Target: new interface(./AIterator)
+ Adapter: Adaptee를 호출하여 포워딩하여 주는 객체(./EnumerationIterator)
## Chain-of-responsibility pattern
> 요청을 처리할 수 있는 기회를 하나 이상의 객체에게 부여함으로써  
> 요청하는 객체와 처리하는 객체 사이의 결합도를 없애는 패턴  
>
> 요청을 해걀하는 객체를 만날 때까지 객체 고리를 따라서 요청을 전달  
>
> 요청을 보낸 쪽하고 받는 쪽을 분리  
> 사슬에 들어가는 객체를 바꾸거나 순서를 바꿈으로써 역할을 동적으로 추가/제거할 수 있으며,  
> 이러한 변화가 전체구조에 아무런 영향을 주지 않는다.  

#### 구성
+ Handler : 요청을 처리하기 위한 수신자들이 가져야 할 인터페이스를 정의
+ ConcreteHandler : Handler 인터페이스 구현
    + 각자가 요청 종류에 따라 자신이 처리할 수 있는 부분을 구현

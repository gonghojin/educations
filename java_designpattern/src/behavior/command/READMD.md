## Command pattern
> `실행될 기능을 캡슐화`함으로써 주어진 여러 기능을 실행할 수 있는 `재사용성`이 높은 클래스를 설계하는 패턴  
> + 이벤트가 발생했을 때 실행될 기능이 다양하면서도 변경이 필요한 경우에   
>   이벤트를 발생시키는 클래스를 변경하지 않고 재사용하고자 할 때 유용
>
> 실행될 기능을 캡슐화함로써 `기능의 실행을 요구하는 호출자(Invoker) 클래스`와 `실제 기능을 실행하는 수신자(Receiver) 클래스` 사이의 `의존성`을 제거  
> + 실행될 기능의 변경에도 호출차 클래스를 수정없이 그대로 사용할 수 있도록 해준다.  

#### 구성  
+ Command : Command 캡슐화, 실행될 기능에 대한 인터페이스, 실행될 기능을 execute 메서드로 선언  
+ ConcreteCommand(./TurnOff~, ./TurnOn) : 실제로 실행되는 기능을 구현, Command라는 인터페이스를 구현, Receiver에서 Command 위임
+ Invoker(./Switch) : 기능의 실행을 요청하는 호출자 클래스  
+ Receiver(./Light) : command execute에 책임. execute 메소드 구현시 클래스

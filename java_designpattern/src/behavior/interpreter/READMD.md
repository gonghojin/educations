## Interpreter pattern
> 간단한 언어의 문법을 정의하고 해석하는데 사용
> + shell command 처리, 통신 프로토콜 처리, 수식계산, 도메인 기반 언어(sql, xml, jsf 등)의 해석에 주로 사용

#### 구성
+ Context: 번역기(interpreter) 전역정보
+ AbstractExpression: 모든 클래스들이 공통으로 가져야 할 Interpret() 오퍼레이션을 추상 오퍼레이션으로 정의
+ TerminalExpression: 문법에 정의한 터미널 기호와 관련된 해석 방법을 구현.  
+ NonTerminalExpression: 문법 룰과 터미널 기호가 아닌 모든 기호에 대해 구현.  

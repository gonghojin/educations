## Decorator pattern
> 원본에 무언가를 더하거나 제외하여 새로운 것을 만듦  
>
> 동적으로 객체에 책일음 추가  
>
> Decorator는 기능을 확장하기 위하여, 서브 클래스화를 융통적으로 선택할 수 있게 함
> + BufferedReader br = new BufferedReader(new FileReader(new File("abc.txt")));

> Decorator는 Proxy 패턴하고 비슷함  
> 차이점은?  
> + Proxy
>   + 반환값을 수정하지 않고 온전하게 반환
> + Decorator
>   + 반환 값을 조작해서 반환

### Decorator 구성
+ Component: interface(./Cookie)
+ ComponentImplementation: decorate를 할 원본 code(./CookieBrave)
+ Decorator: component decorator
+ ExtendedComponent: 여분의 기능을 추가하는 component decorator
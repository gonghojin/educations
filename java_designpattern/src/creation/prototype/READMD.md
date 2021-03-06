## Prototype pattern
> `런타임`에 그 타입이 결정되는 `거의 동일한 객체의 집합`을 만드려고 할 때 적용  
> 새로운 인스턴스가 필요할 때, 이미 생성된 인스턴스를 클론화하여 사용  
+ DB에서 데이터를 가져와서 객체 생성하는 경우에 동일 데이터를 다시 DB에서 가져오기보다는    
  이미 생성된 객체를 복사해서 사용하면 효율적
### 인스턴스를 만드는 방법

### Shallow clone vs Deep clone
+ Shallow clone(얕은 복사)
    + 기본형 타입 멤버 변수는 `값을` 복사  
    + 사용자 정의 객체를 멤버 변수로 가진 경우, `참조 주소값을` 복사
        + 즉, 복제된 객체 내이 사용자 정의 객체 멤버 변수 변경 시  
          원본 객체 내의 사용자 정의 객체 멤버 변수도 변경됨(Deep clone과 대비)
+ Deep clone(깊은 복사)
    + 사용자 정의 객체의 멤버변수의 참조 주소값이 아닌, `새로운 주소를` 할당하여 값을 복제
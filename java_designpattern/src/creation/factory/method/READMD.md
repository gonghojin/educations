##  Factory method pattern  
Factory 자체를 추상화하여 여러 스타일(car or truck factory)의 concrete class를 구현
+ 자동차 종류 특색에 맞는 Factory가 필요하지만, 모든 자동차 공장마다 생성 공정시 품질을 일정하게 유지하기 위해 공통적인 공정은 본사에서 지정  
> 자동차를 주문하면 SportCar와 SedanCar 공장에서 특징에 맞게 자동차를 생산  
>  본사 규정에 따라 모든 테스트와 도색은 본사 규정대로 실시  
> 이후 고객에게 생산된 자동차를 전달
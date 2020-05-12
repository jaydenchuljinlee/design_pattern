package com.example.decorator;

/*
* 첨가 요소에 대한 추상 클래스
* 음료 베이스 클래스를 상속한다.
* */
public abstract class CondimentDecorator extends Beverage {

    //모든 첨가물을 데코레이터에서 getDescription() 메서드를 새로 구현하도록 만든다.
    public abstract String getDescription();
}

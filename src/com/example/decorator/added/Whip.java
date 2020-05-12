package com.example.decorator.added;

import com.example.decorator.Beverage;
import com.example.decorator.CondimentDecorator;

/*
 * 휘핑크림 클래스
 * 첨사 요소에 해당
 * */
public class Whip extends CondimentDecorator {

    //감싸고자하는 음료(다크로스트,에스프레소 등등)를 저장하는 인스턴스
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        //음료명에 첨가물명을 부여한다.
        return this.beverage.getDescription() + ", 휘핑";
    }

    //CondimentDecorator는 Beverage를 확장
    @Override
    public double cost() { return .30 + this.beverage.cost();}


}

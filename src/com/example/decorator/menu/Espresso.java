package com.example.decorator.menu;

import com.example.decorator.Beverage;

/*
* 에스프레소 클래스
* 메인 메뉴에 해당
* */
public class Espresso extends Beverage {

    public Espresso() {
        //Beverage로부터 상속
        description = "에스프레소 커피";
    }

    @Override
    public double cost() {return 1.99;}
}

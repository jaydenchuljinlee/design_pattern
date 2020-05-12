package com.example.decorator.menu;

import com.example.decorator.Beverage;

/*
 * 다크로스트 클래스
 * 메인 메뉴에 해당
 * */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        //Beverage 상속
        description = "다크로스트 커피";
    }

    @Override
    public double cost() {return 2.99;}
}

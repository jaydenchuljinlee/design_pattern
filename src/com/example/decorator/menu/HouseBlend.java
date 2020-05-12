package com.example.decorator.menu;

import com.example.decorator.Beverage;

/*
 * 하우스블렌드 클래스
 * 메인 메뉴에 해당
 * */
public class HouseBlend extends Beverage {

    public HouseBlend() {

        description = "하우스블렌디드 커피";
    }

    @Override
    public double cost() { return 4.12;}
}

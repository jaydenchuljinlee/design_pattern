package com.example.decorator;

import com.example.decorator.added.Mocha;
import com.example.decorator.added.Soy;
import com.example.decorator.added.Whip;
import com.example.decorator.menu.DarkRoast;
import com.example.decorator.menu.Espresso;
import com.example.decorator.menu.HouseBlend;

import java.util.ArrayList;

/*
* 커피숍 클래스
* */
public class StarbuzzCoffee {

    //커피숍 오픈
    public void shopOpen() {

        order();//주문 메서드 호출
    }

    //주문
    private void order() {

        ArrayList<Beverage> list = new ArrayList<>();

        //에스프레소 커피
        Beverage espresso = new Espresso();

        list.add(espresso);//에스프레소 추가


        //다크로스트 커피 + 모카 + 모카 + 휘핑크림
        Beverage darkRoast = new DarkRoast();

        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        list.add(darkRoast);//다크로스트 추가


        //하우스 블렌드 커피 + 두유 + 모카 + 휘핑크림
        Beverage houseBlend = new HouseBlend();

        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);

        list.add(houseBlend);//하우스블렌드 추가


        showTotalCost(list);//주문 정보를 보여주는 메서드 호출
    }

    //주문 정보를 보여줌
    private void showTotalCost(ArrayList<Beverage> list) {

        for (Beverage beverage : list) System.out.println(beverage.getDescription() + " : " + beverage.cost());
    }
}

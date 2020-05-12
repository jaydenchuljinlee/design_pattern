package com.example.decorator;

/*
* 기본 음료 베이스 클래스
* 모든 음료 클래스의 부모 클래스
* */
public abstract class Beverage {

    protected String description = "음료 상세";

    public abstract double cost();

    public String getDescription() {
        return this.description;
    }
}

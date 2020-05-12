package com.example;

import com.example.decorator.StarbuzzCoffee;
import com.example.proxy.ProxyExample;

public class Main {

    public static void main(String[] args) {

        //StarbuzzCoffee starbuzzCoffee = new StarbuzzCoffee();

        //starbuzzCoffee.shopOpen();

        ProxyExample proxyExample = new ProxyExample();

        proxyExample.start();
    }
}

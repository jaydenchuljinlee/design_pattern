package com.example.proxy;

public class ProxyExample {

    public void start() {

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage();
        image2.displayImage();
    }
}

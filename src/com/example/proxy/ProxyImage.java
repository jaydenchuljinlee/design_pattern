package com.example.proxy;

/*
* 프록시 이미지 클래스
* */
public class ProxyImage implements Image {

    private String fileName;
    private Image image;//실제 이미지 클래스를 저장할 하위 클래스 변수

    public ProxyImage (String fileName) {

        this.fileName = fileName;
    }

    @Override
    public void displayImage() {//프록시에서 이미지를 보여주는 메서드를 호출할 때 실제 이미지 클래스 생성

        if (this.image == null) {

            this.image = new RealImage(fileName);//처음 생성할 때는 이미지 로딩 메서드가 호출
        }

        this.image.displayImage();//실제 이미지 객체를 생성한 뒤에 이미지를 보여주는 메서드를 실행한다.
    }
}

package com.example.proxy;

/*
* 실제 이미지 클래스
* */
public class RealImage implements Image {

    private String fileName;

    public RealImage (String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();//이미지 로딩 메서드 호출
    }

    private void loadImageFromDisk() {

        System.out.println("Loading " + this.fileName);
    }

    @Override
    public void displayImage() {

        if (this.fileName != null) {

            System.out.println("Displaying  " + this.fileName);
        } else {

            System.out.println("file is nothing!!!");
        }
    }
}

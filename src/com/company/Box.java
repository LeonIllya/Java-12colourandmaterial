package com.company;

public class Box {
    private int width;
    private int length;
    private int height;
    private String colour;
    private String material;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Box(int width, int length, int height, String colour, String material) {
        this(width,length,height);
        this.colour = colour;
        this.material = material;
    }

    double getVolume(){
        return width*length*height;
    }

    public void setWidth(int width) {
        if(width >=0){
            this.width = width;
        } else{
            System.out.println("Ошибка! Не может быть отрицательным числом");
            this.width = 0;
        }

    }

    public void setLength(int length) {
        if(length >=0){
            this.length = length;
        } else{
            System.out.println("Ошибка! Не может быть отрицательным числом");
            this.length = 0;
        }
    }

    public void setHeight(int height) {
        if(height >=0){
            this.height = height;
        } else{
            System.out.println("Ошибка! Не может быть отрицательным числом");
            this.height = 0;
        }
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

}

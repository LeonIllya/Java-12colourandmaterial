package com.company;


public class Box {
    private int width = 0;
    private int length = 0;
    private int height = 0;
    private int  material = 0;

   public Box(){

   }
    public Box(int width, int length, int height) {
       if(width <=0 || length <=0 || height <=0){
            throw new IllegalArgumentException("Вы ввели не правильное значение: ");

       }
           this.width = width;
           this.length = length;
           this.height = height;
    }

    public Box(int width, int length, int height, int material) {
       this(width,length,height);
       if(material<=0 || material>5){
            throw new IllegalArgumentException("Вы ввели не правильное значение: ");
        }
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

    public void setMaterial(int material) {
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

    public int getMaterial() {
        return material;
    }


    public String toString(){
        StringBuilder result = new StringBuilder();

        result.append(" Box{").append("width =").append(width).append(", ").
                append("length = ").append(length).append(", ").
                append("height = ").append(height).append(", ").
                append("material = ").append(material).append("}");

        return result.toString();
    }

}

package com.company;



public class Main {

    public static void main(String[] args) {
        Box object1 = new Box(1,2,3,4);

        System.out.println("Обьем 1 коробки: " +object1.getVolume());
        object1.setWidth(-6);
        object1.setLength(8);
        object1.setHeight(5);
        System.out.println("\n\tШирина фигуры: " +object1.getWidth());
        System.out.println("\tДлина фигуры: " +object1.getLength());
        System.out.println("\tВысота фигуры: " +object1.getHeight());

        System.out.println("\nОбьем 1 коробки: " +object1.getVolume());

        ColorBox colorBox = new ColorBox(1,2,3,2,5);

        System.out.println("" +colorBox.getVolume());

        System.out.println("" +colorBox.getColour(2));

        System.out.println("" +colorBox.getMaterial(5));

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Box object1 = new Box(2,4,5, "blue","iron");

        System.out.println("Обьем 1 коробки: " +object1.getVolume());
        object1.setWidth(-6);
        object1.setLength(8);
        object1.setHeight(5);
        System.out.println("\n\tШирина фигуры: " +object1.getWidth());
        System.out.println("\tДлина фигуры: " +object1.getLength());
        System.out.println("\tВысота фигуры: " +object1.getHeight());

        System.out.println("\nОбьем 1 коробки: " +object1.getVolume());


        Box object2 = new Box( 2,6,4,"red","wood");

        System.out.println("\nОбьем 2 коробки: " +object2.getVolume());
        object2.setWidth(10);
        object2.setLength(5);
        object2.setHeight(5);
        System.out.println("\n\tШирина фигуры: " +object2.getWidth());
        System.out.println("\tДлина фигуры: " +object2.getLength());
        System.out.println("\tВысота фигуры: " +object2.getHeight());

        System.out.println("\nОбьем 2 коробки: " +object2.getVolume());



        Box object3 = new Box(5,7,2);
        Box object4 = new Box(6,7,1);
        Box object5 = new Box(3,2,1);



        System.out.println("\n\n\nОбьем 3 коробки: " +object3.getVolume());
        System.out.println("Обьем 4 коробки: " +object4.getVolume());
        System.out.println("Обьем 5 коробки: " +object5.getVolume());

    }
}

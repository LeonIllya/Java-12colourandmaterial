package com.company;



public class Main {

    public static void main(String[] args) {

        try {
            Box object1 = new Box(1, 2, 3, 1);
            Warehouse w1 = new Warehouse(1);
            w1.addBox(object1);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Box object2 = new Box(-1, 2, 3, 2);
            Warehouse w1 = new Warehouse(4);
            w1.addBox(object2);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Box object3 = new Box(9,10,11,-2);
            Warehouse w1 = new Warehouse();
            w1.addBox(object3);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Box object4 = new Box(5,6,7);
            Warehouse w1 = new Warehouse();
            w1.addBox(object4);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Box object5 = new Box(3,-7,6);
            Warehouse w1 = new Warehouse();
            w1.addBox(object5);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            ColorBox colorBox = new ColorBox(1,2,3,2,5);
            Warehouse w1 = new Warehouse();
            w1.addBox(colorBox);
            System.out.println("\n" +w1.toString());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Box box = new Box(6,7,8);
        System.out.println("\n" +box.toString());
    }
}

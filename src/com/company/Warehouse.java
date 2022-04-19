package com.company;


import java.util.Arrays;

public class Warehouse extends ColorBox {
    private static final int object = 10;
    private int curAmount = -1;
    private final Box[] arrayBox;

    public Warehouse(){
       arrayBox = new Box[object];
    }

    public Warehouse(int i){
         arrayBox = new Box[i];
    }

    public void addBox(Box newBox){
        ++curAmount;
        if(curAmount < arrayBox.length){
            arrayBox[curAmount] = newBox;
        } else{
            System.out.println("Ошибка!");
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" + super.toString() +
                ", arrayBox=" + Arrays.toString(arrayBox) +
                '}';
    }
}

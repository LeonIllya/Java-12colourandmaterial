package com.company;

public class ColorBox extends Box{
    private int colour;


    public ColorBox(int width, int length, int height, int colour, int material){
        super(width, length, height, material);
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }


    public enum Colour{
        RED("красный"),
        BLUE("голубой"),
        WHITE("белый"),
        BLACK("черный"),
        BROWN("коричневый");

        private String value;

        Colour(String value) {
            this.value = value;
        }
    }

    public static Colour getColour(int i){
        switch (i){
            case 1: return Colour.RED;
            case 2: return Colour.BLUE;
            case 3: return Colour.WHITE;
            case 4: return Colour.BLACK;
            case 5: return Colour.BROWN;
        }
        return Colour.RED;
    }

    public enum Material{
        WOOD("дерево"),
        IRON("железо"),
        PLASTIC("пластик"),
        CARDBOARD("картон"),
        COPPER("медь");

        private String number;

        Material(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

    public static Material getMaterial(int j){
        switch (j) {
            case 1: return Material.WOOD;
            case 2: return Material.IRON;
            case 3: return Material.PLASTIC;
            case 4: return Material.CARDBOARD;
            case 5: return Material.COPPER;
        }
        return Material.WOOD;
    }
}

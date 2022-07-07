package com.fasttrack.enums;

public class EnumExercise {
    public static void main(String[] args) {
        CardinalPoints south = CardinalPoints.SOUTH;
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints east = CardinalPoints.EAST;
        CardinalPoints west = CardinalPoints.WEST;
        System.out.println(south);
        System.out.println(south.getSymbol());
        System.out.println(south.ordinal());
        System.out.println(south.toDirection());
        System.out.println(CardinalPoints.EAST.toDirection());

        System.out.println(CardinalPoints.valueOf("NORTH").toDirection());
        CardinalPoints fromSymbol = CardinalPoints.fromSymbol("EEE");
        if (fromSymbol != null) {
            System.out.println(fromSymbol.toDirection());
        } else {
            System.out.println("Cardinal point not found!");
        }

        System.out.println(CardinalPoints.NORTH);

    }
}

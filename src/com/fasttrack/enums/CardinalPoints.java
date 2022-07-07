package com.fasttrack.enums;

public enum CardinalPoints {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E");

    private String symbol;

    CardinalPoints(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toDirection() {
        return switch (this) {
            case NORTH -> "UP";
            case SOUTH -> "DOWN";
            case EAST -> "RIGHT";
            case WEST -> "LEFT";
        };
    }

    public static CardinalPoints fromSymbol(String symbol) {
        CardinalPoints[] cardinalPoints = CardinalPoints.values();
        for (CardinalPoints point : cardinalPoints) {
            if (point.symbol.equals(symbol)) {
                return point;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CardinalPoints{" +
                "name='" + name() + '\'' +
                "symbol='" + symbol + '\'' +
                '}';
    }
}

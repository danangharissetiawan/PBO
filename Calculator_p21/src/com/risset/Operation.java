package com.risset;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    ADDITION(Double::sum),
    SUBTRACTION((x,y) -> x-y),
    MULTIPLICATION((x,y) -> x*y),
    DIVISION((x,y) -> x/y),
    PERCENTAGE((x, y) -> x%y);

    private final DoubleBinaryOperator operation;

    Operation(DoubleBinaryOperator operation) {
        this.operation = operation;
    }

    public DoubleBinaryOperator getOperation() {
        return operation;
    }

}


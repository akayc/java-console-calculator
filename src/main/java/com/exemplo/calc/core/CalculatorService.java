package com.exemplo.calc.core;

import com.exemplo.calc.model.Operation;

public class CalculatorService {

    public double calculate(double num1, double num2, Operation op) {
        return switch (op) {
            case ADD -> num1 + num2;
            case SUBTRACT -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
                }
                yield num1 / num2;
            }
        };
    }
}
package com.exemplo.calc;

import com.exemplo.calc.core.CalculatorService;
import com.exemplo.calc.model.Operation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a operação (+, -, *, /): ");
            String opInput = scanner.nextLine();
            Operation operation = Operation.fromSymbol(opInput);

            System.out.print("Digite o segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = calculator.calculate(num1, num2, operation);

            System.out.printf("Resultado: %.2f%n", result);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Por favor, insira números válidos.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;
    public static final int SQUARE = 2;

    public static void main(String[] args) {

        in = new Scanner(System.in);

        System.out.println("Введите сторону a");
        testingInput();
        double sideA = in.nextDouble();

        System.out.println("Введите сторону b");
        testingInput();
        double sideB = in.nextDouble();

        System.out.println("Введите сторону c");
        testingInput();
        double sideC = in.nextDouble();

        System.out.println("Строны: a = " + sideA + " b = " + sideB + " c = " + sideC + '\n');

        if (Math.pow(sideA, SQUARE) == Math.pow(sideB, SQUARE) + Math.pow(sideC, SQUARE)
                || (Math.pow(sideB, SQUARE) == Math.pow(sideA, SQUARE) + Math.pow(sideC, SQUARE)
                || (Math.pow(sideC, SQUARE) == Math.pow(sideB, SQUARE) + Math.pow(sideA, SQUARE)))){
            System.out.println("Стороны данных размеров, МОГУТ образовать прямоугольный треугольник");
        } else {
            System.out.println("Треугольник с этими параметра не имеет прямого угла.");
        }
    }

    private static void testingInput() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }
}

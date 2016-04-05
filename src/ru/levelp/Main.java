package ru.levelp;
import java.util.Scanner;
/**
 * Created by Weisekopf on 04.04.16.
 */

/*
    ДЗ
    Написать калькулятор по такому алгоритму:
    1) Пользователь вводит первое число
    2) Пользователь вводит операцию (+ - * / % ^)
    3) Пользователь вводит второе число и ему выводится результат
    *) Если сначала вводится не число, а функция (sqrt, log, ln, lg, sin, cos, tan, atan),
       то следом вводится число и вычисляется функция от введенного числа
       sin(5) = ...
     */

public class Main {
    public static void main(String[] args) {

        boolean varMode;
        float varFirstVal, varSecondVal, varResult = 0;
        String varOperation;

        System.out.println("\t === Калькулятор ===");
        Scanner in = new Scanner(System.in);
        System.out.println("\t Введите первое число, либо укажите функцию (sqrt, log, ln, lg, sin, cos, tan, atan): ");

        if (in.hasNextFloat()) { // работа с двумя операндами
            varMode = true;
            varFirstVal = in.nextFloat(); // считываем первое число
            System.out.println("\t Укажите операцию (+ - * / % ^):");
            varOperation = in.nextLine(); // считываем операцию
            varOperation = in.nextLine(); // костыль для сканнера
            System.out.println("\t Введите второе число:");
            varSecondVal = in.nextFloat(); // считываем второе число

        } else { // работа с одним операндом
            varMode = false;
            varOperation = in.nextLine(); // считываем функцию
            System.out.println("\t Введите число:");
            varFirstVal = in.nextFloat(); // считываем число
            varSecondVal = 0;

        }

        if (varMode) {
            if (varOperation.equals("+")) {
                varResult = varFirstVal + varSecondVal;
            }
            if (varOperation.equals("-")) {
                varResult = varFirstVal - varSecondVal;
            }
            if (varOperation.equals("*")) {
                varResult = varFirstVal * varSecondVal;
            }
            if (varOperation.equals("/")) {
                varResult = (float) varFirstVal / varSecondVal;
            }
//            if (varOperation == "%") {
//                varResult = varFirstVal + varSecondVal;
//            }
            if (varOperation.equals("^")) {
                varResult = (float) Math.pow(varFirstVal, varSecondVal);
            }

        } else {
            if (varOperation.equals("sqrt")) {
                varResult = (float) Math.sqrt(varFirstVal);
            }

            // обычный логарифм log?

            if (varOperation.equals("ln")) {
                varResult = (float) Math.log(varFirstVal);
            }
            if (varOperation.equals("lg")) {
                varResult = (float) Math.log10(varFirstVal);
            }
            if (varOperation.equals("sin")) {
                varResult = (float) Math.sin(varFirstVal);
            }
            if (varOperation.equals("cos")) {
                varResult = (float) Math.cos(varFirstVal);
            }
            if (varOperation.equals("tan")) {
                varResult = (float) Math.tan(varFirstVal);
            }
            if (varOperation.equals("atan")) {
                varResult = (float) Math.atan(varFirstVal);
            }
        }

        System.out.println("\t Результат равен " + varResult);


    }
}

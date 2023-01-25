package com.dimova;

public class Main {
    public static void main(String[] args) {

        // Целые числа
        byte varByte = 127; // -128..127
        short varShort = 32767; // -32768..32767
        int varInt = 1; // 32 бита
        long varLong = 1L; // 64 бита

        // Числа с плавающей точкой
        float varFloat = 0.0f; // 32 бита
        double varDouble = 0.0d; // 64

        // Логический
        boolean varBool = true;

        // Символьный
        char varChar = '0';
        char varChara = 'a';

        // Максимальные значения
        int maxInt = Integer.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        // Операции
        System.out.println("Сложим int и double и получим: " + (varInt + varDouble));
        System.out.println("Вычтем из short long и получим: " + (varShort - varLong));
        System.out.println("Поделим float на ноль и получим: " + (varFloat / 0));
        System.out.println("Логическое и: " + (varBool && false));
        System.out.println("Логическое не: " + (!varBool));
        System.out.println("Остаток от деления short на byte получим: " + (varShort % varByte));
        System.out.println("Сложим значения символов в ASCII номерах и получим: " + (varChar + varChara));

        // Переполнение
        System.out.println("Переполнение от сложения двух максимальных int: " + (maxInt + maxInt));
        System.out.println("Переполнение от сложения двух максимальных short: " + (maxShort + maxShort));
        System.out.println("Переполнение от сложения двух максимальных long: " + (maxLong + maxLong));
    }
}

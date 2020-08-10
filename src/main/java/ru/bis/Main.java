package ru.bis;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(isCharA('A'));
        printBinareFrom0To30();
        showMaxIntAndMoreThanMax();
        System.out.println(getInt('2'))  ;
        System.out.println(getChar(65))  ;
    }

    public static byte summ(byte x1, short x2){
        return (byte) (x1 + x2);
    }

    public static int multiply(int x1, long x2) {
        return (int) (x1 * x2);
    }

    public static int getMaxNumber(int x1, int x2){
        return x1 > x2 ? x1 : x2;
    }

    public  static boolean isCharA(char char1){
        return char1 == 'A';
    }

    public  static boolean isCharNumber(char char1){
        return Character.isDigit(char1);
    }

    public static void printBinareFrom0To30(){
        for (int i = 0; i <= 30; i++)
        System.out.println(Integer.toBinaryString(i));
    }
    public static void showMaxIntAndMoreThanMax(){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int getInt(char char1){
        return Integer.parseInt(Character.toString(char1));
    }

    public static char getChar(int charCode){
        return (char) charCode;
    }
}

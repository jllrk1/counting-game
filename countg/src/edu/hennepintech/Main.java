package edu.hennepintech;

public class Main {

    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 30; count++) {
            if (count % 8 == 0 && count % 12 == 0) {
                System.out.println("buzz zap");
            } else if (count % 5 == 0) {
                System.out.println("beep");
            } else if (count % 8 == 0) {
                System.out.println("buzz");
            } else if (count % 12 == 0) {
                System.out.println("zap");
            } else {
                System.out.println(count);
            }
        }
    }
}




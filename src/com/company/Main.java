package com.company;

public class Main {

    public static void main(String[] args) {
        double drop[] = {9, -15, 5, -3, 5, 9, -8, 8};

        boolean isStart = false;
        int col = 0;
        double sum = 0;

        for (int i = 0; i < drop.length; i++) {
            if (drop[i] < 0){
                isStart = true;
            }

            if (isStart){
                if (drop[i] > 0){
                    sum += drop[i];
                    col++;
                }
            }
        }
        System.out.println("result = " + sum / col);
    }
}


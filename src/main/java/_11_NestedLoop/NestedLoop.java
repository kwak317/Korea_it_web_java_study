package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        // 네모 별 찍기
        //*****
        //*****
        //*****
        //*****
        //*****

        for (int i = 0; i < 5; i++) { //세로줄
            for (int j = 0; j < 5; j++) { //가로로 별찍기
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println(" ");

        //별 삼각형 찍기
        //*
        //**
        //***
        //****
        //*****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //*****
        //****
        //***
        //**
        //*
        for (int i = 6; i > 0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        ssss* i = 0, j 4번 j < 4
        sss** i = 1, j 3번 j < 3
        ss*** i = 2, j 2번 j < 2
        s****
        *****
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.println("S");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

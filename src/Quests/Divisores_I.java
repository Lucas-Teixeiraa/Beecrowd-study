package Quests;

import java.util.Scanner;

public class Divisores_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        if(start > 0){
            for (int i = 1; i<=start;i++){
                if((start%i)==0){
                    System.out.println(i);
                }
            }
        }
    }
}

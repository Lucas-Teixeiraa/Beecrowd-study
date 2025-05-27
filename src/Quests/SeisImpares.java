package Quests;

import java.util.Scanner;
//BeeCrowd - 1070 - Lucas Teixeira
public class SeisImpares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int i = 0;
        while(i < 6){
            if(start %2!=0){
                System.out.println(start);
                i++;
            }
            start+=1;
        }
    }
}

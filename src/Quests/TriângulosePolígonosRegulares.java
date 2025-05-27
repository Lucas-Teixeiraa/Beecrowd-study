package Quests;

import java.util.Scanner;

//BeeCrowd - 2058 - Lucas Teixeira
public class TriângulosePolígonosRegulares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dif = N - 2;

        if(N == 3) System.out.println(1);
        else System.out.println(dif);
    }
}

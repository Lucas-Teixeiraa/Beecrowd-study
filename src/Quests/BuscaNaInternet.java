package Quests;

import java.util.Scanner;

//BeeCrowd - 2413 - Lucas Teixeira
public class BuscaNaInternet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int secondLink = t * 2;
        int primaryLink = secondLink*2;
        System.out.println(primaryLink);
    }
}

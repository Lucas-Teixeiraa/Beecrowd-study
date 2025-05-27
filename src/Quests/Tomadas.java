package Quests;

import java.util.Scanner;

//BeeCrowd - 1930 - Lucas Teixeira
public class Tomadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] valor = new int[4];
        int sum = 0;
        for(int i = 0; i < valor.length;i++){
            valor[i] = sc.nextInt();
            sum+=valor[i];
        }
        System.out.println(sum - 3);
        sc.close();
    }
}

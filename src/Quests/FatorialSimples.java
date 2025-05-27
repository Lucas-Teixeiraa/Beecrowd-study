package Quests;

import java.util.Scanner;

//BeeCrowd - 1153 - Lucas Teixeira
public class FatorialSimples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int resultFatorial = 1;
        for(i = 1; i<=N;i++){
            resultFatorial *=i;
        }
        System.out.println(resultFatorial);
    }
}

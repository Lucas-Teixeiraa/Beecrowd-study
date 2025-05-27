package Quests;

import java.util.Scanner;

//BeeCrowd - 2006 - Lucas Teixeira
public class IdentificandoOcha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i<=5;i++){
            int test = sc.nextInt();
            if(test == T){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

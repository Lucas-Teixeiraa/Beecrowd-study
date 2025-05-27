package Quests;

import java.util.Scanner;
//BeeCrowd - 2388 - Lucas Teixeira
public class Tacografo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int sum = 0;
        int mult = 0;
        int T = 0;
        int V = 0;
        for(int i = 1; i<=start;i++){
            T = sc.nextInt();
            V = sc.nextInt();
            mult = T * V ;
            sum += mult;
        }
        System.out.println(sum);
        sc.close();
    }
}

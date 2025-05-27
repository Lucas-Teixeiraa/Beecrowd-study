package Quests;

import java.util.Scanner;

//BeeCrowd - 1144 - Lucas Teixeira
public class SequênciaLogica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <=N;i++){
            int j = i*i;
            int k = i*i*i;
            System.out.printf("%d %d %d\n",i, j, k);
            System.out.printf("%d %d %d\n",i, j+1, k+1);

        }
        sc.close();
    }
}

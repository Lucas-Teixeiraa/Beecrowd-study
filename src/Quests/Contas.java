package Quests;

import java.util.Scanner;
//BeeCrowd - 1866 - Lucas Teixeira
public class Contas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int N = 0;
        int count = 0;
        for(int i = 0; i<cases;i++){
            N = sc.nextInt();
            if(N%2==0){
                System.out.println(0);
            }else System.out.println(1);
        }

    }
}

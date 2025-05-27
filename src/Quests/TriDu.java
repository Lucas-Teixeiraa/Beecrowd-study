package Quests;

import java.util.Scanner;

//BeeCrowd - 1933 - Lucas Teixeira
public class TriDu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A == B) System.out.println(A);
        else if(A > B) System.out.println(A);
        else System.out.println(B);

    }
}

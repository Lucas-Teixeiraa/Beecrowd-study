package Quests;

import java.util.Scanner;
//BeeCrowd - 2936 - Lucas Teixeira
public class QuntasMandiocas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder saida = new StringBuilder();
        int curu  = sc.nextInt();
        int boitata = sc.nextInt();
        int boto = sc.nextInt();
        int mapi = sc.nextInt();
        int iara = sc.nextInt();

        int come = curu*300 + boitata*1500 + boto*600 + mapi*1000 + iara*150 + 225;

        saida.append(come);

        System.out.println(saida);
        sc.close();
    }
}

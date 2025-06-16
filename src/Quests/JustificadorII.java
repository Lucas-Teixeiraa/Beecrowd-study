package Quests;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//BeeCrowd - 1278 - Lucas Teixeira
public class JustificadorII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean primeiroCaso = true;
        while(true){
            int n_linhas = sc.nextInt();
            sc.nextLine();

            if(n_linhas == 0){
                break;
            }

            if(!primeiroCaso) System.out.println();
            primeiroCaso = false;

            List<String> linhasProcessadas = new ArrayList<>();
            int comprimentoMaximo = 0;

            for(int i = 0; i < n_linhas;i++){
                String linhaOriginal = sc.nextLine();
                String linhaProcessada = linhaOriginal.trim().replaceAll("\\s+", " ");

                linhasProcessadas.add(linhaProcessada);

                if(linhaProcessada.length() > comprimentoMaximo){
                    comprimentoMaximo = linhaProcessada.length();
                }
            }

            for(String texto: linhasProcessadas){
                String textoJustificado = String.format("%" + comprimentoMaximo + "s", texto);
                System.out.println(textoJustificado);
            }

        }

        sc.close();
    }
}

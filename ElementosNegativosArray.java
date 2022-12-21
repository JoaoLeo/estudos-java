package app;
import java.util.Scanner;
import java.util.ArrayList;
public class ElementosNegativosArray {

//        Faça um programa que leia um número inteiro positivo N e depois N números inteiros
//        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> negativos = new ArrayList<Integer>();
        int nIndex = 0;
        System.out.print("Quantidade de numeros : ");
        int n = input.nextInt();
        for(int i=0; i < n; i++ ){
            System.out.print("Digite um numero: ");
            nIndex = input.nextInt();
            vetor.add(nIndex);
            if(nIndex < 0)
                negativos.add(nIndex);
        }

        System.out.print("Numeros digitados: ");
        for (int v:
             vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
        if(negativos.size() > 0) {
            System.out.print("Numeros negativos: ");
            for (int vn : negativos) {
                System.out.print(vn + " ");
            }
        } else {
            System.out.println("Voce não digitou nenhum numero negativo");
        }
        input.close();
    }

}
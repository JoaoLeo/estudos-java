import java.util.Scanner;

class AnalisadorNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);       
        int soma = 0;
        int maiorNum = 0;
        int menorNum = 0;  
        double media;

        System.out.print("Digite a quantidade de valores para analisar: ");
        int qtd = input.nextInt();
        int n [] = new int[qtd];
        
        for(int c = 0;  c < qtd ; c++){ // Adicionando valores no array
            System.out.printf("Valor %d: ", (c+1));
            n[c] = input.nextInt();
        }

        for(int i = 0; i < qtd ; i++){ //Percorre o array e guarda o maior valor  e o menor valor
            if(n[i] > maiorNum){
                maiorNum = n[i];
                menorNum = maiorNum; 
            }

            if(n[i] < menorNum){
                menorNum = n[i];
            }
        }

        System.out.print("Valores digitados: ");

        for (int i : n) { // Mostrando valores
            System.out.print(i + " ");
        }

        for(int c = 0 ; c < qtd ; c++){ // Somando valores no array
            soma += n[c];
        }

        media = soma / qtd;
        System.out.printf("\nA média dos valores digitados é: %.1f \n",media);
        System.out.printf("O maior valor digitado foi: %d \n" , maiorNum);
        System.out.printf("O menor valor digitado foi: %d" , menorNum);
        input.close();

    }
}

import java.util.Scanner;

class AdivinhadorNum {
    public static void main(String[] args) {        
        /* Random gera um valor aleatorio entre 0.0 e 0.99 então multiplicando por 10 teremos um valor entre 0 e 9 e somando 1
        retorna se um valor aleatorio entre 1 e 10.*/
        String res;
        System.out.println("O computador pensou em um numero entre 1 e 10 tente adivinhar!");
        Scanner input = new Scanner (System.in);
        int num = 1 + (int) (Math.random() * 10);
        System.out.print("Palpite: ");
        int userNum = input.nextInt();
        res = (num == userNum) ? "Acertou" : "Errou";
        System.out.printf("Seu palpite: %d | Numero sorteado: %d \n" ,userNum,num);
        System.out.println(res);
        input.close();
    }
}

import java.util.Scanner;

class verificadorIdade {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = input.nextLine();
        System.out.print("Quantos anos voce tem? ");
        byte idade = input.nextByte();
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade );
        System.out.print("Voce é ");
        if(idade >= 0 && idade <=13){
            System.out.println("Criança");
        } else if(idade >= 14 && idade <= 17 ){
            System.out.println("Adolescente");
        } else if(idade >=18 && idade <=25){
            System.out.println("Jovem");
        } else if(idade >= 26 && idade <= 60){
            System.out.println("Adulto");
        } else{
            System.out.println("Idoso");
        }
        input.close();
    }
}

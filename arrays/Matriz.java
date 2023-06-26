package arrays;

public class Matriz {
    /*
    Write a Java program to print the following grid
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     */
    public static void main(String[] args) {
        int[][] mat = new int[10][10]; //inicia uma matriz como 10 posições tanto vertical quanto horizontal
        for(int column = 0; column < 10; column++){ // percorre as colunas
            for(int row = 0; row < 10; row++){ //percorre as linhas
                System.out.print(mat[column][row]); //printa o valor matriz na poisção[coluna][linha]
            }
            System.out.println(); //pula uma linha depois de percorrer uma coluna
        }
    }

}

package application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Product;
public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: (C:\\Users\\joao.ferreira\\Documents\\estudos-java\\arquivos\\arquivosExemplo) ");
        String path = input.nextLine();
        File sourceFile = new File(path);
        String sourceFolderStr = sourceFile.getParent();
        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " Criado!");

            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        input.close();
    }
}

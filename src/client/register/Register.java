package client.register;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) throws IOException {
        Scanner register = new Scanner(System.in);

        /**
         * Pegando a quantidade de clientes a serem registrados
         */
        System.out.print("Quantos clientes deseja adicionar : ");
        int numClients = register.nextInt();
        register.nextLine();

        // Caminho do arquivo CSV
        String filePath = "C:\\Users\\Wesley\\Documents\\estudos java\\teste\\clients.csv";
        File file = new File(filePath);


        FileWriter writer = new FileWriter(filePath, true);

        // Escreve o cabeçalho apenas se o arquivo estiver vazio
        if (file.length() == 0) {
            writer.write("name,age,phone,gender,\n");
        }

        /*
         * Pegando dados de usuários:
         */
        for (int i = 0; i < numClients; i++) {
            System.out.println("Informe os dados do cliente " + (i + 1) + ":");
            System.out.print("Nome: ");
            String name = register.next();
            System.out.print("Idade: ");
            int age = register.nextInt();
            System.out.print("Telefone: ");
            String phone = register.next();
            System.out.print("Sexo: ");
            String gender = register.next();

            String data = name + "," + age + "," + phone + "," + gender + "\n";
            writer.write(data);
        }

        writer.close(); // Fecha o arquivo
        System.out.println("Dados adicionados! ");
    }
}

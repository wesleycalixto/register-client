
package client.register;

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

        FileWriter writer = new FileWriter("C:\\Users\\Wesley\\Documents\\estudos java\\teste\\clients.csv", true);

        /*
         *Pegando dados de usuarios:
         */
        for (int i = 0; i < numClients; i++) {
            System.out.println("Informe os dados do cliente" + ( i + 1) + ":" );
            System.out.println("Nome: ");
            String name = register.next();
            System.out.println("Idade: ");
            int age = register.nextInt();
            System.out.println("Telefone? ");
            String phone = register.next();
            System.out.println("Sexo? ");
            String gender = register.next();


            String data = age + "," + name + "," + age + "," + phone + "," + gender + "\n";
            writer.write(data);
        }
        writer.close(); //Fecha o arquivo
        System.out.println("Dados adicionados! ");


    }

    ;

}

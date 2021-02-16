import models.Cipher;

import java.io.Console;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Welcome to encrypt!");
            System.out.println("Would you like to encrypt or decrypt a statement?");
            String userEncrypt = myConsole.readLine();

            if (userEncrypt.equals("encrypt")) {
                System.out.println("please enter a statement you would like to encrypt:");
                String statement = myConsole.readLine();

                System.out.println("please enter encryption key");
                int key = myScanner.nextInt();

                Cipher userEncryption = new Cipher(statement,key);
                String encryption = userEncryption.isActuallyEncrypted(statement,key);

                System.out.println("The encrypted statement is: /n"+ encryption);

            } else if (userEncrypt.equals("decrypt")) {
                System.out.println("please enter a statement to decrypt");
                String statementDecrypt = myConsole.readLine();

                System.out.println("please enter an decryption key");
                int keyDecrypt = myScanner.nextInt();

                Cipher userDecryption = new Cipher(statementDecrypt,keyDecrypt);
                String decryption = userDecryption.toDecrypt(statementDecrypt,keyDecrypt);

                System.out.println("The decrypted statement is: \n" + decryption);
            } else if (userEncrypt.equals("exit")){
                runProgram = false;
            }
            else {
                System.out.println("sorry we could nor recognize the input.");
            }
        }
    }
}


import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Ios {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        AppleiPhone myIphone = new AppleiPhone();
        apps(); // Mostrar a lista de apps disponíveis
        int userChoice = terminal.nextInt();

        executeApp(userChoice, myIphone); // Passar a instância do iPhone

        terminal.close();
    }

    static void apps() {
        System.out.println("Bem vindo ao Iphone, Apps disponíveis: ");
        System.out.println("1 - Spotify");
        System.out.println("2 - Chrome");
        System.out.println("3 - Phone");
        System.out.println("Digite o número do App desejado:");
    }

    static void executeApp(int choice, AppleiPhone myIphone) {
        Scanner terminal2 = new Scanner(System.in);
        Scanner terminalStrings = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("Abrindo o Spotify...");
                // lógica para executar o Spotify
                myIphone.selectMusic();
                break;
            case 2:
                System.out.println("Abrindo o Chrome...");
                // lógica para executar o Chrome
                myIphone.openChrome();
                int userChoice2 = terminal2.nextInt();

                if (userChoice2 == 1) {
                    myIphone.addTab();
                    System.out.println("Digite o que vc deseja pesquisar:");
                    String search = terminalStrings.nextLine();
                    myIphone.updatePage();
                    myIphone.displayPage(search);
                } else {
                    System.out.println("Fechando app...");
                }

                break;
            case 3:
                System.out.println("Abrindo o Phone...");
                // lógica para executar o Phone
                myIphone.startPhone();
                int userChoice3 = terminal2.nextInt();
                if(userChoice3 == 1) {
                    System.out.println("Digite o numero para ligar:");
                    String num = terminalStrings.nextLine();
                    myIphone.makeCall(num);
                }
                else if (userChoice3 == 2) {
                    myIphone.answerCall();
                }
                else {
                    myIphone.startVoiceMail();
                }
                break;
            default:
                System.out.println("Escolha inválida. Encerrando...");
        }
        terminal2.close();
        terminalStrings.close();
    }
}

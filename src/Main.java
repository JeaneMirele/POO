import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a capacidade do elevador: ");
        int capacidade = sc.nextInt();

        System.out.println("Digite o total de andares do prédio (sem contar o térreo): ");
        int totalAndares = sc.nextInt();

        elevator.inicializa(capacidade, totalAndares);

        int escolha;
        do {
            System.out.println("MENU");
            System.out.println("1- Ver status do elevador");
            System.out.println("2-Adicionar pessoa ao elevador");
            System.out.println("3- Remover pessoa do elevador");
            System.out.println("4- Subir de andar");
            System.out.println("5- Descer de andar");
            System.out.println("6- Sair do programa");


            escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    elevator.status();
                    break;

                case 2:
                    elevator.entra();
                    break;

                case 3:
                    elevator.sai();
                    break;

                case 4:
                    elevator.subir();
                    break;

                case 5:
                    elevator.descer();
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Escolha Inválida!");
            }

        } while (escolha!=6);


    }

}

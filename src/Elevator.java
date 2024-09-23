import java.util.Scanner;

public class Elevator{
    private int andar;
    private int totalAndares;
    private int capacidade;
    private int pessoas;


    public void inicializa(int capacidade, int totalAndares){
        this.capacidade= capacidade;
        this.totalAndares= totalAndares;
        this.andar=0;
        this.pessoas=0;
    }

    public void entra(){
        if(capacidade>pessoas){
            this.pessoas+=1;
            System.out.println("Adicionado 1 pessoa ao elevador.");
        } else {
            System.out.println("Elevador cheio!");
        }

    }
    public void sai(){
        if(pessoas>0){
            this.pessoas-=1;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void subir(){
       if(pessoas>0) {
           this.andar += 1;
       }
    }
    public void descer(){
        if(pessoas>0) {
            this.andar -= 1;
        }
    }

    public void status(){
        System.out.println("Andar atual:"+ this.andar);
        System.out.println("Capacidade total:"+ this.capacidade);
        System.out.println("Pessoas presentes:" + this.pessoas);

    }

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
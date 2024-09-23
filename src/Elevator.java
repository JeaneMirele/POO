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

}
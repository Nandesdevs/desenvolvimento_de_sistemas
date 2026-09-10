class Pessoa {
    String nome;
    int idade;
    void apresentar(){
        System.out.println("Olá, meu nome é "+ nome + " e tenho "+ idade + " anos.");
    }
}

public class NewClass {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "AnaBanana";
        pessoa1.idade = 20;

        pessoa1.apresentar();
    }
}
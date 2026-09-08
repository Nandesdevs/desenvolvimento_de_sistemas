class Funcionario {
    String nome;
    Double salario;

    void trabalhar(){
        System.out.println(nome + " está trabalhando...");
    }
}

class Gerente extends Funcionario {
    void gerenciar(){
        System.out.println(nome + " está gerenciando");
    }

    void salario_gerente(){
        System.out.println("O salario do gerente " + nome + " é " + salario);
    }
}

class Gerente_Chefe extends Gerente {
    void mandar(){
        System.out.println("O Gerente chefe " + nome + " comanda tudo e todos!");
    }
}
public class ExHeranca {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Felps";
        funcionario.salario = 2.00;
        funcionario.trabalhar();
        System.out.println();

        //Gerente continua com os atributos de Funcionario, isso é herança
        Gerente gerente = new Gerente();
        gerente.nome = "Rodolfo";
        gerente.salario = 2800.00;
        gerente.trabalhar();
        gerente.gerenciar();
        gerente.salario_gerente();
        System.out.println();

        //Gerente chefe manda em geral slk, ele herdou gerente
        Gerente_Chefe gerente_chefe = new Gerente_Chefe();
        gerente_chefe.nome = "Rodrigão";
        gerente_chefe.trabalhar();
        gerente_chefe.mandar();
    }
}

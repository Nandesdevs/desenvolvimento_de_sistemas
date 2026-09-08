class Aluno {
    // Atributo privado (Encapsulamento)
    private String nome;

    // Construtor personalizado para garantir que o Aluno sempre nasça com um nome
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Método Getter (para ler o nome se for necessário fora da classe)
    public String getNome() {
        return this.nome;
    }

    // Método Setter (para alterar o nome se for necessário, com validações se quiser)
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    void estudar() {
        System.out.println(this.nome + " está estudando");
    }
}

// Não vai rodar por que ja tem uma public class main
public class Main {
    public static void main(String[] args) {
        // Instancia o aluno já definindo seu estado inicial de forma segura
        Aluno aluno = new Aluno("Nandes");
        aluno.estudar();
    }
}
public class Produto {
    private int id;
    private String nome;
    private int quantidadeEstoque;

    public Produto(int id, String nome, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return id + " " + nome + " " + quantidadeEstoque;
    }

    public int getId() {
        return id;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }
}

package ucb.guizao;

public abstract class InstumentoMusical {
    protected String nome;
    protected String material;

    public InstumentoMusical(String material, String nome) {
        this.material = material;
        this.nome = nome;
    }

    public abstract void tocar();

    public void afinar(){
        System.out.println("Afinando o " + nome);
    }

    public void mostrarInfrmacoes() {
        System.out.printf("Instrumento: %s\n Material: %s\n", nome, material);
    }
}

package ucb.guizao;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String material, String nome) {
        this.material = material;
        this.nome = nome;
    }

    public abstract void tocar();

    public void afinar(){
        System.out.println("Afinando o " + nome);
    }

    public void mostrarInformacoes() {
        System.out.printf("Instrumento: %s\nMaterial: %s\n", nome, material);
    }
}

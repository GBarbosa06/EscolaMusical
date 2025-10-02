package ucb.guizao;

public class Violao extends InstrumentoMusical {
    private int numeroDeCordas;
    public Violao(String material, String nome, int numeroDeCordas) {
        super(material, nome);
        this.numeroDeCordas = numeroDeCordas;
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Girando as tarraxas...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando com zelo todas as "+ numeroDeCordas +" cordas do " + nome + "...");
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Numero de cordas: " + numeroDeCordas);
    }
}

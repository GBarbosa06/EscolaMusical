package ucb.guizao;

public class Piano extends InstrumentoMusical {
    public Piano(String material, String nome) {
        super(material, nome);
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando o piano");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando lindamente o " +  nome + "...");
    }
}

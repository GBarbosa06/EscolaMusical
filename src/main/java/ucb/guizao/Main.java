package ucb.guizao;


public class Main {
    public static void main(String[] args) {

        InstrumentoMusical[] orquestra = new InstrumentoMusical[4];

        orquestra[0] = new Piano("Madeira", "Piano");
        orquestra[1] = new Violao("Madeira", "Violão", 6);
        orquestra[2] = new Violino("Madeira", "Violino", 4);
        orquestra[3] = new Bandolim("Madeira", "Bandolim", 4);

        System.out.println("Informações dos instrumentos:");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.mostrarInformacoes();
        }
        
        System.out.println("Afinando os instrumentos...");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.afinar();
        }

        System.out.println("A orquestra está começando a tocar!");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.tocar();
        }

    }
}
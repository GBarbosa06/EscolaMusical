package ucb.guizao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Violao violao1 = new Violao("madeira", "violao", 6);
        violao1.tocar();
        violao1.afinar();
    }
}
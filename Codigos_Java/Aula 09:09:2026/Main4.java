import org.example.Pedido;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {

        Thread cozinheiro = new Thread(
            new Pedido("Hamburguer"), "Cozinheiro"
        );

        Thread atendente = new Thread(
            new Pedido("Suco"), "Atendente"
        );

        Thread axuliar = new Thread(
            new Pedido("Batata"), "Auxiliar"
        );
        cozinheiro.start();
        atendente.start();
        axuliar.start();

        //Indicando que todos os thread finalizaram:
        cozinheiro.join();
        atendente.join();
        axuliar.join();
        
        System.out.println("Todos os pedidos terminaram!");

    }
}
public class Principal {

    public static void main(String[] args) {

        Download arquivo1 = new Download("Arquivo 1");
        Download arquivo2 = new Download("Arquivo 2");
        Download arquivo3 = new Download("Arquivo 3");
        Download arquivo4 = new Download("Arquivo 4");
        Download arquivo5 = new Download("Arquivo 5");

        arquivo1.start();
        arquivo2.start();
        arquivo3.start();
        arquivo4.start();
        arquivo5.start();

        try {
            arquivo1.join();
            arquivo2.join();
            arquivo3.join();
            arquivo4.join();
            arquivo5.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida.");
        }

        System.out.println("Todos os downloads foram concluídos!");
    }
}
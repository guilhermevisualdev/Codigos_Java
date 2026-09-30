public class Download extends Thread {

    private String nomeArquivo;

    public Download(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void run() {

        for (int i = 10; i <= 50; i += 10) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Download interrompido.");
            }

            System.out.println(nomeArquivo + " - " + i + " MB baixados");
        }

        System.out.println(nomeArquivo + " - Download concluído!");
    }
}
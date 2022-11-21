package a1;
public class Caixa implements Runnable {
    private Client client;
    private int id;
    private int suma;

    @Override
    public void run() {
        client.getCarret();
    }
}

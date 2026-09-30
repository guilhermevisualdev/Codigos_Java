package org.example;

public class Pedido implements Runnable{
    private final string
}



@Override 
public void run(){
    
    for (int etapa = 1; etapa <= 3; etapa++) {
        System.out.println(
            Thread.currentThread().getName()
            + " | " + nome
            + " | etapa " + etapa
        );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
    System.out.println()
    );
}
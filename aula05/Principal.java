public class Principal{
    public static void main(String[] args){
        System.out.println("=== Testeando fila ===");
        Fila<String> fila = new Fila<String>("Letras");
        fila.enfileirar("A");
        fila.imprimiFila();

        fila.enfileirar("B");
        fila.imprimiFila();

        fila.desenfileirar();
        fila.imprimiFila();
    }
}
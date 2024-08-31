public class Principal{
    public static void main(String[] args){
        System.out.println("=== Tetando Pilha ===");
        Pilha<String> pilha = new Pilha<String>("letras");

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Elemento Removido: " + pilha.pop()); 
        pilha.imprimePilha();
    }
}
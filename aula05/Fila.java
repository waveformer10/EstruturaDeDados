public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("Fila");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            ultimoNo = primeiroNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }
    
    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("Fila Vazia");
            return null;
        }

        T dadoTemp = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if(primeiroNo == null){
            ultimoNo = null;
        }

        return dado;
    }

    public void imprimiFila(){
        if(primeiroNo == null){
            System.out.println("Fila vazia!");
        }else{
            System.out.println("Dados da fila", nomefila);

            No<T> nextNo = primeiroNo;

            while(nextNo != null){
                System.out.printf("{" + nextNo.getDado() + "}");
                nextNo = nextNo.getNextNo();
            }
        }
    }
}
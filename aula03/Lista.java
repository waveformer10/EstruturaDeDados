class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("lista");
    }

    public Lista(String nomeLista){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeLista = nomeLista;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dado: %s foi removido da lista.", primeiroNo.getDado());
            primeiroNo = primeiroNo.getNextNo();
        }
    }

    public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia!");
        }else{
            System.out.printf("Dados: " + ultimoNo.getDado() + " removido da Lista");

            No<T> noRemove = primeiroNo;

            while(noRemove.getNextNo() != ultimoNo){
                noRemove = noRemove.getNextNo();
            }
            ultimoNo = noRemove;
            noRemove.setNextNo(null);
        }
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dados da lista %s:\n", nomeLista);

            No<T> aux = primeiroNo;

            while(aux != null){
                System.out.printf("{%s}\n", aux.getDado());
                aux = aux.getNextNo();
            }
        }
    }
}
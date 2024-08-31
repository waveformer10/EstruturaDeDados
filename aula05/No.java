class No<T>{

    private T dado;
    private No<T> aux;

    public No(T dado){
        this.dado = dado;
        this.aux = null;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setNextAux(No<T> aux){
        this.aux = aux;
    }

    public No<T> getNextNode(){
        return this.nextNo;
    }

    public String imprimeDados(){
        return "{Dado : " + getDado() + "}";
    }

}
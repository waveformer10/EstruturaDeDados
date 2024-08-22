class No<T>{

    private T dado;
    No<T> aux;

    public No(T dado){
        this.dado = dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setAux(No<T> aux){
        this.aux = aux;
    }

    public String imprimeDados(){
        return "{Dado : " + getDado() + "}";
    }

}
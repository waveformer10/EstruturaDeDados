class No<T>{

    private T dado;
    No<T> nextNo;

    public No(T dado){
        this.dado = dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }
    
    public No<T> getNextNode(){
        return this.nextNo;
    }

    @Override
    public String toString(){
        return "Dado{ " + getDado() + "}";
    }

}
public class Principal{
    
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.imprimeLista();
        lista.addInicio("R");
        lista.addInicio("M");
        lista.imprimeLista();
        lista.addFinal("G");
        lista.imprimeLista();
        lista.addMeio("P", 2);
        lista.imprimeLista();
        lista.removeMeio(1);
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }

}
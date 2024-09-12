public class Principal{
    
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.imprimeLista();
        lista.addInicio("Marcelo");
        lista.imprimeLista();
        lista.addInicio("Ba");
        lista.imprimeLista();
        lista.addFinal("Batata");
        lista.imprimeLista();
        lista.addFinal("Jorge");
        lista.imprimeLista();

        lista.addMeio("Pedro", 2);
        lista.imprimeLista();

        lista.removeMeio(2);
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }

}
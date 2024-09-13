public class Principal{
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Marcelo");
        lista.imprimeLista();
        lista.addInicio("Ba");
        lista.imprimeLista();
        lista.addFinal("BU");
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }
}
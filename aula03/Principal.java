public class Principal{
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Marcelo");
        lista.imprimeDados();
        lista.addInicio("Ba");
        lista.imprimeDados();
        lista.addFinal("BU");
        lista.imprimeDados();
        lista.removeInicio();
        lista.imprimeDados();
        lista.removeFinal();
        lista.imprimeDados();
    }
}
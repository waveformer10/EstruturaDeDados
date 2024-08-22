public class Principal{
    public static void main(String[] args){

        No<String> obj1 = new No<String>("Marcelo");
        System.out.println(obj1.imprimeDados());

        No<Integer> obj2 = new No<Integer>(19);
        System.out.println(obj2.imprimeDados());

        No<String> obj3 = new No<String>("Cecilia");
        System.out.println(obj3.imprimeDados());

        obj1.setAux(obj2);
        obj2.setAux(obj3);

        System.out.println(obj1.imprimeDados());
        System.out.println(obj1.getAux().imprimeDados());
        System.out.println(obj1.getAux().getAux().imprimeDados());

        No<String> objAux = obj1;
        while(objAux != null){
            System.out.println(objAux.imprimeDados());
            objAux = objAux.getAux();
        }

    }
}
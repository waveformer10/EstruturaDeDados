public class Principal{
    public static void main(String[] args){

        No<String> obj1 = new No<String>("Marcelo");
        System.out.println(obj1.toString());

        No<Integer> obj2 = new No<Integer>(19);
        System.out.println(obj2.toString());

        No<String> obj3 = new No<String>("Cecilia");
        System.out.println(obj3.toString());

        System.out.println("Imprimindo dados da Lista.");
        System.out.println(obj1.toString());

        obj1.setNextNo(obj2);
        System.out.println(obj1.getNextNode().toString());

        obj2.setNextNo(obj3);
        System.out.println(obj2.getNextNode().toString());

        No<String> objNextNo = obj1;
        while(objNextNo != null){
            System.out.println(objNextNo.toString());
            objNextNo = objNextNo.getNextNode();
        }

    }
}
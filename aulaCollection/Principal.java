import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

public class Principal{
    public static void main(String[] args){
        LinkedList<Pessoa> listaPessoa = new LinkedList<Pessoa>();

        listaPessoa.add(new Pessoa("Marcelo", 19));
        listaPessoa.add(new Pessoa("Edson", 43));
        listaPessoa.add(new Pessoa("Cleison", 32));
        listaPessoa.add(new Pessoa("Maria", 27));

        Iterator i = listaPessoa.iterator();
        while (i.hasNext()) {
            String pessoa = i.next().toString();
            System.out.println(pessoa);
            
        }
        System.out.println("*** " + listaPessoa.get(2) + " ***");
    }
}
import java.util.Iterator;
import java.util.LinkedList;

public class L04 {

    public static void main(String[] args) {

        LinkedList<String> coresLinkedList = new LinkedList<>();

        coresLinkedList.add("Azul");
        coresLinkedList.add("Verde");
        coresLinkedList.add("Roxo");
        coresLinkedList.add("Preto");

        Iterator<String> iterator = coresLinkedList.descendingIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}

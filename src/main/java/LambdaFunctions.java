import java.util.*;

public class LambdaFunctions {

    public static void ordenar () {
        List<String> lista = new ArrayList<String>();
        lista.add("C");
        lista.add("A");
        lista.add("B");

        Collections.sort(lista, (String s1, String s2) -> s1.compareTo(s2));

        for(String s : lista) {
            System.out.println(s);
        }
    }

    public static void calcular () {
        Operacion operacion = (double x, double y) -> (x + y)/2;
        System.out.println(operacion.calcularPromedio(2, 3));
    }

    public static void sortTest() {
        List<ObjectOrder> orderList = new ArrayList<>();
        orderList.add(new ObjectOrder(2, "Hotel 1"));
        orderList.add(new ObjectOrder(8, "Hotel 2"));
        orderList.add(new ObjectOrder(1, "Hotel 3"));
        orderList.add(new ObjectOrder(10, "Hotel 4"));

        //Sorting list
        orderList.sort(Comparator.comparing(ObjectOrder::getRange));
        orderList.forEach(o -> System.out.println(o.getRange()));
    }

    //It is order by insertion
    public static void SortTreeMapTest() {
        Set<ObjectOrder> set = new TreeSet<>();
        set.add(new ObjectOrder(8, "Hotel 2"));
        set.add(new ObjectOrder(1, "Hotel 3"));
        set.add(new ObjectOrder(10, "Hotel 4"));

        System.out.println("Order insertion");
        set.forEach(o -> System.out.println(o.getRange()));

        System.out.println("Add one more");
        set.add(new ObjectOrder(2, "Hotel 1"));
        set.forEach(o -> System.out.println(o.getRange()));


    }

    public static void main(String args[]) {
        //sortTest();
        SortTreeMapTest();
    }

}

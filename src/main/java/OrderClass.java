import java.util.*;

public class OrderClass {

    public List<ObjectOrder> sortWithoutTreeMap() {
        List<ObjectOrder> orderList = getData("asc");
        //Sorting list
        orderList.sort(Comparator.comparing(ObjectOrder::getRange));
        return orderList;
    }

    //It is order by insertion
    public Set<ObjectOrder> sortWithTreeMap(String order) {
        List<ObjectOrder> data = getData(order);
        Set<ObjectOrder> set = new TreeSet<>();
        data.forEach(d -> set.add(d));
        return set;

    }

    public List<ObjectOrder> getData(String order) {
        List<ObjectOrder> list = new ArrayList<>();
        list.add(new ObjectOrder(8, order));
        list.add(new ObjectOrder(1, order));
        list.add(new ObjectOrder(10, order));
        return list;
    }

    public static void main(String args[]) {
        OrderClass oc = new OrderClass();
        oc.sortWithTreeMap("asc");
    }

}

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderClass {

    @Autowired
    private DataProvider dataProvider = new DataProvider();

    public List<ObjectOrder> sortWithoutTreeMap() {
        List<ObjectOrder> orderList = dataProvider.getFillingData();
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
        oc.sortWithoutTreeMap();
    }

}

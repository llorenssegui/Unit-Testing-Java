import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private List<ObjectOrder> data;

    public List<ObjectOrder> getData() {
        return data;
    }

    public void setData(List<ObjectOrder> data) {
        this.data = data;
    }

    public List<ObjectOrder> getFillingData() {
        List<ObjectOrder> list = new ArrayList<>();
        list.add(new ObjectOrder(8, "Hotel 2"));
        list.add(new ObjectOrder(1, "Hotel 3"));
        return list;
    }
}

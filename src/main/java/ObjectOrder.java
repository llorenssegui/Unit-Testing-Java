public class ObjectOrder implements Comparable<ObjectOrder> {

    private int range;
    private String order = "asc";

    public ObjectOrder(int range, String order) {
        this.range = range;
        this.order = order;
    }

    public int getRange() {
        return this.range;
    }

    public String getOrder() {return this.order;}

    @Override
    public int compareTo(ObjectOrder o) {
        if(o.getOrder().equals("desc")) {
            return this.range <= o.getRange() ? 1 : -1;
        } else {
            return this.range > o.getRange() ? 1 : -1;
        }
    }
}

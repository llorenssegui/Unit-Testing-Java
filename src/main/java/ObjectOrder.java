public class ObjectOrder implements Comparable<ObjectOrder> {

    private int range;
    private String hotelName;

    public ObjectOrder(int range, String hotelName) {
        this.range = range;
        this.hotelName = hotelName;
    }

    public int getRange() {
        return this.range;
    }

    @Override
    public int compareTo(ObjectOrder o) {
        return this.range > o.getRange() ? 1 : -1;
    }
}

public class Mobile extends Device {
    private int weight;

    public Mobile(String title, String vendor, int prise, int weight) {
        super(title, vendor, prise);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "weight=" + weight +
                '}';
    }
}

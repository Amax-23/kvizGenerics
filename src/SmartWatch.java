public class SmartWatch extends Device {
    private boolean isColored;

    public SmartWatch(String title, String vendor, int prise, boolean isColored) {
        super(title, vendor, prise);
        this.isColored = isColored;
    }

    public boolean isColored() {
        return isColored;
    }
}

public class Device extends Product {
    private String vendor;

    public Device(String title, String vendor, int prise) {
        super(title, prise);
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }
}

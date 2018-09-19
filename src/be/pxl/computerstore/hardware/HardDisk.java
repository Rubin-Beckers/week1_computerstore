package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {
    private int capacity;

    public HardDisk(String vendor, String name, double price, int capacity) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        setArticleNumber();
        setCapacity(capacity);
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

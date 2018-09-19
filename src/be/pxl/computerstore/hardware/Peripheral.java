package be.pxl.computerstore.hardware;

public abstract class Peripheral extends ComputerComponent {
    public Peripheral(String vendor, String name, double price) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        setArticleNumber();
    }

    public String toString() {
        String article = super.toString();
        article = getClass() + " " + article;
        return article;
    }
}

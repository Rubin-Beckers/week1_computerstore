package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {
    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        setArticleNumber();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFullDescription() {
        String description = super.getFullDescription();
        description += String.format("Width = %d \nHeight = %d \nDepth = %d \nWeight = %d", getDimension().getWidth(), getDimension().getHeight(), getDimension().getDepth(), getWeight());

        return description;
    }
}

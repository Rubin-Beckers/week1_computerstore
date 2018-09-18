package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {
    private Dimension caseDimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        setArticleNumber();
    }

    public Dimension getCaseDimension() {
        return caseDimension;
    }

    public void setCaseDimension(Dimension caseDimension) {
        this.caseDimension = caseDimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFullDescription() {
        String description = super.getFullDescription();
        description += String.format("Width = %d \nHeight = %d \nDepth = %d \nWeight = %d", getCaseDimension().getWidth(), getCaseDimension().getHeight(), getCaseDimension().getDepth(), getWeight());

        return description;
    }
}

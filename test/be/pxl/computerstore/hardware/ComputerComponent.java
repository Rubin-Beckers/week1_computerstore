package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;

    private static int itemID = 0;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber() {
        String tempVendor = vendor;
        String number = String.valueOf(itemID);

        while (tempVendor.length() < 3) {
            tempVendor += "X";
        }

        while (number.length() < 5) {
            number = 0 + number;
        }

        itemID++;
        articleNumber = tempVendor + "-" + number;
    }

    @Override
    public String toString() {
        return getName() + " (" + getArticleNumber() + ")";
    }

    public String getFullDescription() {
        String description = String.format("ArticleNumber = %s \nVendor = %s \nName = %s \nPrice = %.2f \n", getArticleNumber(), getVendor(), getName(), getPrice());

        return description;
    }
}

package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent{
    private double clockspeed;
    private final double MIN_CLOCKSPEED = 0.7;

    public Processor(String vendor, String name, double price, double clockSpeed) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        setClockspeed(clockSpeed);
        setArticleNumber();
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed < MIN_CLOCKSPEED) {
            clockspeed = MIN_CLOCKSPEED;
        }
    }

    public String getFullDescription() {
        String description = super.getFullDescription();
        description += String.format("Clock speed = %.2f", getClockspeed());

        return description;
    }
}

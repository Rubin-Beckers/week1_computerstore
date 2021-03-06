package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;

    private Peripheral[] peripherals = new Peripheral[3];
    private static int numberOfPeripherals = 0;
    public static final int MAX_PERIPHERAL = 3;

    public ComputerSystem() {
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if (numberOfPeripherals >= MAX_PERIPHERAL) {
            throw new TooManyPeripheralsException("You have reached the maximum amount of peripheras allowed.");
        } else {
            peripherals[numberOfPeripherals] = peripheral;
            numberOfPeripherals++;
        }
    }

    public void removePeripheral(String articleNumber) {
        for(Peripheral testedPeripheral : peripherals) {
            if (testedPeripheral.getArticleNumber() == articleNumber) {
                testedPeripheral = null;
            }
        }
    }

    public int getNumberOfPeripherals() {
        return numberOfPeripherals;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    @Override
    public double totalPriceExcl() {
        return computerCase.getPrice() + processor.getPrice() + hardDisk.getPrice();
    }
}

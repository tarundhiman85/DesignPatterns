package FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        //we are changing laptop factory design methods stops us to create objects
        //we just need to change string just client need to know string
        LaptopFactory alF = new LaptopFactory();
        Laptop laptop = alF.getNewLaptop("Ordered");
        laptop.spec();
    }
}

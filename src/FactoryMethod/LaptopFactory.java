package FactoryMethod;

public class LaptopFactory {
    //this class takes responsibility
    public Laptop getNewLaptop(String str){
        if(str.equals("Secured")){
            return new AppleLaptop();
        }
        else if(str.equals("Ordered")){
            return new DellLaptop();
        }
        else{
            return new HPLaptop();
        }
    }
}

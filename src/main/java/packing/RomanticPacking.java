package packing;

import flowers.Order;

public class RomanticPacking extends Packing {

    public  RomanticPacking(Order order){
        super(order);
    }

    @Override
    public boolean process(){
        System.out.println("Packed with romantic paper...");
        return true;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 20;
    }
}

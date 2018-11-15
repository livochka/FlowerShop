package packing;

import flowers.Bouquet;
import flowers.Order;

public class Packing extends Order {
    private Order order;

    public Packing(Order order){
        this.order = order;
    }

    @Override
    public double getPrice(){return order.getPrice();}

    @Override
    public boolean process(){
        return order.process();
    }

    @Override
    public void addBouquet(Bouquet bq){
        order.addBouquet(bq);
    }
}

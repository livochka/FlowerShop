package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;
import delivery.Delivery;
import payment.TransferOnCard;

import java.util.ArrayList;

public class Order {

    private ArrayList<Bouquet> items;
    @Getter @Setter
    private Payment payment = new TransferOnCard();
    @Getter @Setter
    private Delivery delivery;
    private int size = 0;

    public Order() {items = new ArrayList<>();}

    public boolean process(){
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare();
        return status;

    }

    public double getPrice(){
        int price = 0;
        for(Bouquet bouquet: items){
            price += bouquet.getPrice();
        }
        return price;}

    public void addBouquet(Bouquet bouquet){
        items.add(bouquet);
        size += 1;
    }

    public int getSize() {return size;}

    @Override
    public String toString(){
        return "Bouquets";

    }

}

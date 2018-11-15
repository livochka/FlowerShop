package payment;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Setter
@Getter
@AllArgsConstructor
public class TransferOnCard implements Payment {


    @Override
    public  boolean process(double price){
        System.out.println("You withdraw from your card: " + price);
        return true;
    }

}

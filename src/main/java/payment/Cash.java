package payment;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Setter
@Getter
@AllArgsConstructor
public class Cash implements Payment{

    @Override
    public  boolean process(double price){
        System.out.println("You payed by cash: " + price);
        return true;
    }
}

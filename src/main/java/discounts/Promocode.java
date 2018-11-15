package discounts;

import flowers.Order;

import java.util.Scanner;

public class Promocode extends Discount {
    private static String validPromo = "JAVA";
    public  Promocode(Order order){
        super(order);
    }

    @Override
    public double getPrice(){
            return super.getPrice() * 0.7;}

    public static boolean validate(String promo){return promo.equals(validPromo);
    }}


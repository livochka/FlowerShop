package delivery;

public class NovaPoshta implements Delivery{

    @Override
    public boolean prepare(){
        System.out.println("You prepared smth");
        return true;
    }
}

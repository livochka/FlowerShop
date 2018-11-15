import discounts.Minus20;
import discounts.Promocode;
import flowers.Order;
import flowers.Bouquet;
import flowers.Color;
import flowers.FlowerType;
import flowers.Flower;
import flowers.FlowerSpec;
import payment.Cash;
import payment.Payment;
import payment.TransferOnCard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to flower shop!");
        Order order = new Order();
        String answer;
        answer = getAnswer("Do you want to form a bouquet by yourself? y/n ");

        if (answer.equals("n")){
            Bouquet bq = Bouquet.defaultBouquet1();
            System.out.println("You can buy our default bouquet: " + bq.toString());
            answer = getAnswer("Would you like to buy it? y/n");
                if (answer.equals("y")){
                    order.addBouquet(bq); }}


        else {
            ArrayList <Flower> available =availableFlowers();
            System.out.println("List of flowers that are currently available in our shop: ");
            Bouquet bq = new Bouquet();
            for (Flower flower: available){
                System.out.println("Description: " + "\n"+ flower.toString());
                answer = getAnswer("Do you want to add this flower to your bouquet? y/n");
                if (answer.equals("y")){
                    bq.addFlower(flower);
                }}
            System.out.println("That's it! Your formed bouquet: ");
            System.out.println(bq.toString());
            order.addBouquet(bq);}


        if (order.getSize() > 0){
            order = addDiscount(order);
            answer = getAnswer("Do you want to pay by cash? y/n");
            Payment currentPayment;

            if (answer.equals("y")){
                currentPayment = new Cash();
            }

            else{
                currentPayment = new TransferOnCard();
            }

            currentPayment.process(order.getPrice());
        }
        System.out.println("Bye-bye!");





}

    public static Order addDiscount(Order order){
        Scanner sc = new Scanner(System.in);
        String answer = getAnswer("Do you have a minus 20% discount? y/n");
        if (answer.equals("y")){
            order = new Minus20(order);
        }
        answer = getAnswer("Do you have a promocode? y/n");
        if (answer.equals("y")){
            System.out.println("Enter a promocode: ");
            String promo = sc.nextLine();
            if (Promocode.validate(promo)){
                System.out.println("Alright!");
                order = new Promocode(order);}
            else{
                System.out.println("Sorry, it is not correct :)");
        }
        }return order;}


    public static ArrayList<Flower> availableFlowers(){
        FlowerSpec sc = new FlowerSpec();
        ArrayList<Flower> available = new ArrayList<>();
        available.add(new Flower(FlowerType.CHAMOMILE, 25, Color.WHITE, "UA", "nice", 20, sc));
        available.add(new Flower(FlowerType.VIOLA, 20, Color.PURPLE, "UA", "nice", 20, sc));
        available.add(new Flower(FlowerType.VIOLA, 20, Color.RED, "UA", "nice", 20, sc));
        available.add(new Flower(FlowerType.TULIP, 15, Color.BLACK, "UA", "nice", 20, sc));
        available.add(new Flower(FlowerType.TULIP, 15, Color.WHITE, "UA", "nice", 20, sc));
        available.add(new Flower(FlowerType.ROSE, 40, Color.RED, "UA", "nice", 20, sc));
        return available;
    }

    public static String getAnswer(String question){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while ( ! (answer.equals("y") || answer.equals("n"))){
            System.out.println(question);
            answer = sc.nextLine();}
        return answer;}
    }



package flowers;

import  java.util.ArrayList;
import lombok.Getter;

@Getter
public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private int price;
    private int size;

    public void addFlower(Flower flower){
        flowers.add(flower);
        price += flower.getPrice();
        size += 1;
    }

    public static Bouquet defaultBouquet1(){
        Bouquet bq = new Bouquet();
        FlowerSpec sc = new FlowerSpec();
        Flower flower1 = new Flower(FlowerType.CHAMOMILE, 25, Color.WHITE, "UA", "nice", 20, sc);
        Flower flower2 = new Flower(FlowerType.ROSE, 35, Color.RED, "USA", "nice", 20, sc);
        Flower flower3 = new Flower(FlowerType.TULIP, 20, Color.WHITE, "Bulgaria", "nice", 20, sc);
        bq.addFlower(flower1);
        bq.addFlower(flower2);
        bq.addFlower(flower3);
        return bq;
    }

    @Override
    public String toString(){
        StringBuffer info = new StringBuffer();
        for (Flower flower: flowers){
            info.append(flower.toString());
            info.append("\n");
        }
        return info.toString();
    }



}

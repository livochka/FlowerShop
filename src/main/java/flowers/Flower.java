package flowers;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Flower {
    private FlowerType type;
    private int price;
    private Color color;
    private String origin;
    private String odor;
    private int stemLen;
    private FlowerSpec spec;

    @Override
    public String toString(){
        String info = "type - " + this.type  + " price - " + Integer.toString(this.price) + " colour - "
                + this.color + " smell - " + this.odor;
        return info;
    }



}


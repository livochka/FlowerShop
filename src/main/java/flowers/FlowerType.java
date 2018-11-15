package flowers;

public enum FlowerType {
    TULIP("TULIP"), CHAMOMILE("CHAMOMILE"), ROSE("ROSE"), VIOLA("VIOLA");

    private String type;

    FlowerType(String type){
        this.type = type;
    }
}

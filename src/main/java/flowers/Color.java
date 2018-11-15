package flowers;

public enum Color {
    RED("#F00"), BLACK("#000"), BLUE("#00F"), WHITE("##FFF"), PURPLE("#F0F");

    private String rgb;

    Color(String rgb){
        this.rgb = rgb;
    }
}

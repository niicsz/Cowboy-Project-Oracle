public class Garage implements Building {
    private int size;
    private String color;

    public Garage(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
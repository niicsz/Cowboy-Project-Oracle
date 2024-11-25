public class Barn implements Building {
    private int size;
    private String color;

    public Barn(int size, String color) {
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
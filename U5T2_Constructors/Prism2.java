package U5T2_Constructors;

public class Prism2 {
    private int length;
    private int width;
    private int height;

    public Prism2(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism2(int side) {
        length = side;
        width = side;
        height = side;
    }

    public Prism2() {
        length = (int)(Math.random() * 91 + 10);
        width = (int)(Math.random() * 91 + 10);
        height = (int)(Math.random() * 91 + 10);
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public String dimensions() {
        String print = "Length = " + length + "\n";
        print += "Width = " + width + "\n";
        print += "Height = " + height;
        return print;
    }

    public int volume() {
        int volume = length * width * height;
        return volume;
    }

    public int surfaceArea() {
        int area = (2 * length * height) + (2 * length * width) + (2 * width * height);
        return area;
    }
}

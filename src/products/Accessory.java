package products;

public class Accessory extends Product{
    private String color;

    private static final int accessoryCode = 3000;
    private static int numberOfAccessory = 0;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
    }

    @Override
    protected String generateId(){
        numberOfAccessory++;
        return String.valueOf(accessoryCode + numberOfAccessory);
    }

    @Override
    public String toString(){
        return super.toString() + "\nColor: " + this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color is invalid");
        }
        this.color = color;
    }
}

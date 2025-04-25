package products;

public abstract class Product {
    private String title;
    private Double price;
    private final String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        id = generateId();
    }

    @Override
    public String toString(){
        return "ID: " + this.id +"\nTitle: " + this.title + "\nPrice: " + this.price;
    }

    protected abstract String generateId();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title is invalid");
        }
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price is invalid");
        }
        this.price = price;
    }

    public String getId() {
        return id;
    }

}

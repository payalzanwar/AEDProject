package userinterface;

 public class Book {
    private String name;
    private int price;
    private String author;
    private String type;
    private int units;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }
    private String Disease;
    public Book()
    {
        
    }
    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + ", author=" + author
                + "]";
    }

}


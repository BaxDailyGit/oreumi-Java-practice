package Daily0201;

public class Item {
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double setPrice(int price) {
        return this.price = price;
    }
}

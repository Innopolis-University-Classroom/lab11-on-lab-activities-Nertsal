import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product charger = new Charger(13);
        Product headset = new HeadSet(20);
        Pallet electronics = new Electronic();

        Product dress = new Dress(500);
        Product skirt = new Skirt(300);
        Product trouser = new Trouser(5);
        Product tshirt = new TShirt(3);

        Pallet store = new Store();
    }
}

interface Composite {
    void print();

    String name();
}

abstract class Product implements Composite {
    public int price;

    public Product(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println(" -This is a Product: " + name() + " With Price: " + price + "$");
    }
}

abstract class Pallet implements Composite {
    public List<Composite> contents;

    public Pallet(List<Composite> contents) {
        this.contents = contents;
    }

    public void print() {
        System.out.println("This is a Pallet: " + name() + " Contains the Following:");
        for (Composite content : contents) {
            content.print();
        }
    }
}

class Store extends Pallet {
    public Store(List<Composite> contents) {
        super(contents);
    }

    public String name() {
        return "Store";
    }
}

class Electronic extends Pallet {
    public Electronic(List<Composite> contents) {
        super(contents);
    }

    public String name() {
        return "Electronic";
    }
}

class Clothes extends Pallet {
    public Clothes(List<Composite> contents) {
        super(contents);
    }

    public String name() {
        return "Clothes";
    }
}

class WomenClothes extends Clothes {
    public WomenClothes(List<Composite> contents) {
        super(contents);
    }

    public String name() {
        return "Women Clothes";
    }
}

class MenClothes extends Clothes {
    public MenClothes(List<Composite> contents) {
        super(contents);
    }

    public String name() {
        return "Men Clothes";
    }
}

class Charger extends Product {
    public Charger(int price) {
        super(price);
    }

    public String name() {
        return "Charger";
    }
}

class HeadSet extends Product {
    public HeadSet(int price) {
        super(price);
    }

    public String name() {
        return "Headset";
    }
}

class Dress extends Product {
    public Dress(int price) {
        super(price);
    }

    public String name() {
        return "Dress";
    }
}

class Skirt extends Product {
    public Skirt(int price) {
        super(price);
    }

    public String name() {
        return "Skirt";
    }
}

class Trouser extends Product {
    public Trouser(int price) {
        super(price);
    }

    public String name() {
        return "Trouser";
    }
}

class TShirt extends Product {
    public TShirt(int price) {
        super(price);
    }

    public String name() {
        return "T-shirt";
    }
}

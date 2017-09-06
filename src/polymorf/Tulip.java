package polymorf;

/**
 * Created by user22 on 22.08.2017.
 */
public class Tulip extends Flower {
    final int price;
    public Tulip(int price) {
        super("Тюльпан");
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}

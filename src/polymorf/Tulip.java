package polymorf;

/**
 * Created by user22 on 22.08.2017.
 */
public class Tulip extends Flower {
    static final int price = 45;
    public Tulip() {
        super("Тюльпан");
    }
    public int getPrice(){
        return price;
    }
}

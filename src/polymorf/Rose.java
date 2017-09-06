package polymorf;

/**
 * Created by user22 on 17.08.2017.
 */
public class Rose extends Flower{
    final int price;
    public Rose(int price) {
        super("Роза");
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}

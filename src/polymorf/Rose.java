package polymorf;

/**
 * Created by user22 on 17.08.2017.
 */
public class Rose extends Flower{
    static final int price = 100;
    public Rose() {
        super("Роза");
    }
    public int getPrice(){
        return price;
    }
}

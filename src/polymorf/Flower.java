package polymorf;

/**
 * Created by user22 on 17.08.2017.
 */
public class Flower {
    protected String name;
    protected final int price;
    protected Flower(String name, int price){
        this.name = name;
        this.price = price;
    }
    protected int getPrice(){
        return this.price;
    }
}

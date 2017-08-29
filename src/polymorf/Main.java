package polymorf;

/**
 * Created by user22 on 22.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        Flower[] flowers = flowerStore.sell(4, 4, 4);
        Flower[] flowersMix = flowerStore.sellSequence(4, 4, 1);
        arrayOutput(flowers);
        System.out.println();
        arrayOutput(flowersMix);
        System.out.println();
        System.out.println("В магазине сейчас хранится " + flowerStore.getWallet() + " $");
        System.out.println();
        System.out.println("В магазине сейчас хранится " + flowerStore.getWallet() + " $");
        String filename = "files/demo_file.txt";
        FlowerSaver.save(filename, flowersMix);
        Flower[] flowers1 = FlowersLoader.load(filename);
        arrayOutput(flowers1);
    }
    public static void arrayOutput(Flower[] flowers){
        for (int i =0; i < flowers.length; i ++) {
            System.out.print(flowers[i].name);
            if (i != flowers.length-1) System.out.print(", ");
        }
    }
}

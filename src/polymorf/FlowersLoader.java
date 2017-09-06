package polymorf;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by user22 on 22.08.2017.
 */
public class FlowersLoader {
    private FlowersLoader(){

    }
    public static Flower[] load(String filename){
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line1 = br.readLine();
            String line2 = br.readLine();
            int arraySize = Integer.parseInt(line1);
            Flower[] flowers = new Flower[arraySize];
            String[] elements = line2.split(" ");
            for(int i = 0; i < flowers.length; i++){
                if (elements[i].equals("Роза"))
                flowers[i] = new Rose(100);
                if (elements[i].equals("Ромашка"))
                flowers[i] = new Chamomile(70);
                if (elements[i].equals("Тюльпан"))
                flowers[i] = new Tulip(45);
            }
            return flowers;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

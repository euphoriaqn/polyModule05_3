package polymorf;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user22 on 22.08.2017.
 */
public class FlowerSaver {
    private FlowerSaver(){

    }
    public static void save(String filename, Flower[] flowers){

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("" + flowers.length + "\n");
            for (Flower value :flowers){
                writer.write("" + value.name + " ");
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

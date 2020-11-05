import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.google.gson.*;

public class Main {

    public static void main(String[] args) {
        String data = readFile("./cars.json");

        Gson gson = new Gson();
        Makes makes = gson.fromJson(data, Makes.class);

        System.out.println(makes);
    }

    private static String readFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

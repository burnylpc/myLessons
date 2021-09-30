import java.io.*;
import java.util.ArrayList;

public class Parser {

    public ArrayList<String> parse(File file) throws IOException {
        BufferedReader reader = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert reader != null;
            reader.close();
        }

        return list;
    }
}

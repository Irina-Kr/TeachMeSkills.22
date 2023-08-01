import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHistory implements InMemoryHistory {
    public void writeHistory(Operation operation) {
        File file = new File("history.txt");
        FileWriter fileWriter;
        try {
             fileWriter = new FileWriter(file, true);
            fileWriter.write(operation.toString());
            fileWriter.write("c:10");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

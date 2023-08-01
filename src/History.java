import java.util.ArrayList;
import java.util.List;

public class History implements InMemoryHistory {
    List<String>operations = new ArrayList<>();
    @Override
    public void writeHistory(Operation operation){
        operations.add(operation.toString());

    }
}

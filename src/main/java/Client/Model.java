package Client;
import Comon.Animals;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Model {
    private static Model instance = new Model();

    private List<Animals> model;

    public static Model getInstance() {
        return instance;
    }
    private Model() {
        model = new ArrayList<>();
    }
    public void add(Animals animals) {
        model.add(animals);
    }
    public List<String> list() {
        return model.stream()
                .map(Animals::getName)
                .collect(Collectors.toList());
    }

}
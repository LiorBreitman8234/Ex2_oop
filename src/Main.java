import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GraphAlgorithms graph = new GraphAlgorithms();
        graph.load("data/G4.json");
        long startTime = System.currentTimeMillis();
        System.out.println(graph.center().getKey());
        long finishTime = System.currentTimeMillis();
        System.out.println((finishTime - startTime));

    }
}

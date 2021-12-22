public class Main {
    public static void main(String[] args) {
        String file = "/home/bravo8234/LargeConnectedGraphs/10000Nodes.json";
        GraphAlgorithms GA = new GraphAlgorithms();
        long start_time = System.currentTimeMillis();
        GA.load(file);
        long end_time = System.currentTimeMillis();
        System.out.println("time to load " + file + " : " + (end_time-start_time) + " MS");
        start_time = System.currentTimeMillis();
        GA.save("test.json");
        end_time = System.currentTimeMillis();
        System.out.println("time to save" + file + " : " + (end_time-start_time) + " MS");
    }
}

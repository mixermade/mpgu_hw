import java.util.*;

    public class AdjacencyListGraph {
        int n;
        LinkedList<LinkedList<Integer> > adj;

        private String outOfBorders = "-_-";

        private void throwsOutOfBordersExc() {
            throw new RuntimeException(outOfBorders);
        }

        public AdjacencyListGraph(int n0) {
            n = n0;
            adj = new LinkedList<LinkedList<Integer>>();
            for (int i = 0; i < n; ++i) {
                adj.add(new LinkedList<Integer>());
            }

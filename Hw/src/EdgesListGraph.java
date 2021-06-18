import java.util.HashSet;
import java.util.LinkedList;

    public class EdgesListGraph {
        public static class Node {
            private int num;
            private LinkedList < Edge > edgeList;

            public Node(int num) {
                this.num = num;
                edgeList = new LinkedList < > ();
            }

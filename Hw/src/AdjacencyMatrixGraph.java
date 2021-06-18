public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    private String outOfBorders = "-_-";

    private void throwsOutOfBordersExc() {
        throw new RuntimeException(outOfBorders);
    }


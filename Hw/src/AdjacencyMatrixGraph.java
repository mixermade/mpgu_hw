public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    private String outOfBorders = "-_-";

    private void throwsOutOfBordersExc() {
        throw new RuntimeException(outOfBorders);
    }


    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }


    public void addEdge(int i, int j) {
        if (i > numVertices || j > numVertices) {
            throwsOutOfBordersExc();
        }
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }


    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }


    public boolean hasEdge(int i, int j) {
        return adjMatrix[i][j];
    }
}

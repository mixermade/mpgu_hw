import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
    public class binaryTreeTests extends Assertions {
        @Test
        public void insert_addsNewValue_valueIsFound() {
            binaryTree tree = new binaryTree();

            tree.insert( "3");

            assertEquals("3", tree.search("3"));
        }

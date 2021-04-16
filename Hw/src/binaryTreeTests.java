import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
    public class binaryTreeTests extends Assertions {
        @Test
        public void insert_addsNewValue_valueIsFound() {
            binaryTree tree = new binaryTree();

            tree.insert( "3");

            assertEquals("3", tree.search("3"));
        }

        @Test
        public void Min_findsMinOfTree_minEquals1() {
            binaryTree tree = new binaryTree();

            tree.insert( "33");
            tree.insert( "23");
            tree.insert( "1");
            tree.insert( "53");


            assertEquals("1", tree.Min(tree.root));
        }

        @Test
        public void maxValue_findsMaxOfTree_minEquals1() {
            binaryTree tree = new binaryTree();

            tree.insert( "5");
            tree.insert( "2");
            tree.insert( "3");
            tree.insert( "7");
            tree.insert( "34");


            assertEquals("34", tree.Max(tree.root));
        }
    }


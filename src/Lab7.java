import java.util.Scanner;

public class Lab7 {

    static Scanner scanner = new Scanner(System.in);
    static BinaryTree tree = new BinaryTree();

    public static void main(String[] args) {

        boolean isValid = false;
        while (!isValid) {

            displayMenu();
            try {
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter an integer to add to the tree: ");
                        int data = scanner.nextInt();
                        tree.insertInTree(data);
                        break;
                    case 2:
                        System.out.println("Tree Traversal");
                        tree.displayInOrder();
                        System.out.println();
                        break;
                    case 3:
                        int height = tree.treeHeight(tree.root);
                        System.out.println("The Height of the tree is " + height);
                        break;
                    default:
                        isValid = true;
                        System.out.println("Exiting...");
                        break;
                }
            } catch (Exception e) {
                scanner.next();
            }
        }

    }

    public static void displayMenu() {
        System.out.println("1: Add Value to Tree");
        System.out.println("2: Display Tree (In-Order Traversal)");
        System.out.println("3: Display Height");
        System.out.println("4: To Exit");
        System.out.print("> ");
    }


}

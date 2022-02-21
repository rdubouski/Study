package days.day10;

class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(int v) {
        value = v;
    }

    public void insert(Node root, int v) {
        if (v < root.value)
            if ( left != null ) {
                root = left;
                left.insert(root, v);
            }
            else {
                left = new Node(v);
                System.out.println("left " + left.value);
            }
        else
        if ( right != null ) {
            root = right;
            right.insert(root, v);
        }
        else {
            right = new Node(v);
            System.out.println("right " + right.value);
        }
    }

    public void print(Node node){
        if(node != null){
            print(node.left);
            System.out.println(node.value);
            print(node.right);
        }
    }
};

public class Task1 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.insert(root, 14);
        root.insert(root, 23);
        root.insert(root, 11);
        root.insert(root, 16);
        root.insert(root, 22);
        root.insert(root, 27);
        root.insert(root, 5);
        root.insert(root, 15);
        root.insert(root, 18);
        root.insert(root, 24);
        root.insert(root, 150);
        root.insert(root, 8);
        root.print(root);
    }
}
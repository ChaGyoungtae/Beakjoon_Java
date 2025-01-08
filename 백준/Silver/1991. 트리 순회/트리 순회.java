import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class TreeNode {
        char data;
        char left;
        char right;

        public TreeNode(char data, char left, char right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void preOrder(TreeNode root){

        System.out.print(root.data);

        if(root.left != '.'){
            preOrder(tree.get(root.left));
        }

        if(root.right != '.'){
            preOrder(tree.get(root.right));
        }
    }

    public static void inOrder(TreeNode root){

        if(root.left != '.'){
            inOrder(tree.get(root.left));
        }

        System.out.print(root.data);

        if(root.right != '.'){
            inOrder(tree.get(root.right));
        }
    }

    public static void postOrder(TreeNode root){

        if(root.left != '.'){
            postOrder(tree.get(root.left));
        }

        if(root.right != '.'){
            postOrder(tree.get(root.right));
        }

        System.out.print(root.data);
    }

    static Map<Character,TreeNode> tree = new HashMap<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            char b = st.nextToken().charAt(0);
            char c = st.nextToken().charAt(0);

            tree.put(a, new TreeNode(a, b, c));
        }

        preOrder(tree.get('A'));
        System.out.println();
        inOrder(tree.get('A'));
        System.out.println();
        postOrder(tree.get('A'));
    }
}

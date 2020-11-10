package tree;

public class FindSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;
        return isIdentical(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isIdentical(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null || s.val != t.val)
            return false;
        return isIdentical(s.left, t.left) && isIdentical(s.right, t.right);
    }

    public static void main(String[] args) {
        int x=9;
        if(x==9)
        {
            System.out.println("13"+5+3);
            String s1="hi";
            String s2= "hi";
            String s3=new String(s1);
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
            System.out.println(s1==s3);
            System.out.println(s2.equals(s3));
        }
    }
}

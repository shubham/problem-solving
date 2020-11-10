public class Dummy {
    public static void main(String []args){
        int i = 0;
        boolean t = true;
        boolean f = false;
        boolean b = false;
        b = (t || ((i++)==0));
        System.out.println(i);
        b = (f || ((i+=2) > 0));
        System.out.println(i);
    }
}

public class Opinion{
    public static void main(String[] args){
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
public class General{
    public static void main(String[] args){
        String str = String.format("%d", 400/2);
        String str2 = String.format("%b",3>5);
        String str3 = String.format("%x",200);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
public class Gess{
    public static void main(String[] args){
        char word = 'd', word2 = '@';
        int p = 23045, p2 = 45213;
        System.out.println(word+"在unicode表中的顺序位置是:"+(int)word);
        System.out.println(word2+"在unicode表中的顺序位置是:"+(int)word2);
        System.out.println("unicode表中的第"+p+"位是："+(char)p);
        System.out.println("unicode表中的第"+p2+"位是："+(char)p2);
    }
}
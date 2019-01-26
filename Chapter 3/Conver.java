public class Conver{
    public static void main(String[] args){

        byte mybyte = 127;
        int myint = 150;
        char mychar = 10;
        float myfloat = 452.12f;
        double mydouble = 45.46546;

        System.out.println("byte + float " + (mybyte+myfloat));
        System.out.println("byte * int " + mybyte*myint);
        System.out.println("byte / char " + mybyte/mychar);
        System.out.println("double + char " + (mydouble+mychar));
        
        System.out.println(mybyte+mybyte);
    
        mychar = 65535;
        System.out.println(mychar+mychar);
        
        short myshort=32767;
        System.out.println(myshort+myshort);
        System.out.println(myshort*myshort*myshort*myshort);

        myint = 2147483647;
        System.out.println(myint+myint);
    }
}
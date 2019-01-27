public class Division{
    public static void main(String[] args){
        String str = "abc,def,ghi,jkl";
        String[] newstr = str.split(",");
        for(int i = 0; i < newstr.length; i++){
            System.out.println(newstr[i]);
        }

        System.out.println("\n");

        String[] newstr2 = str.split(",",2);
        for(int i = 0; i < newstr.length; i++){
            System.out.println(newstr2[i]);
        }
    }
}
public class Tautog{
    public static void main(String[] args){
        int arr2[][] = {{4,3},{1,2}};
        System.out.println("�����е�Ԫ���ǣ�");
        for(int x[] : arr2){
            for(int e : x){
                //������ά���������һ��Ԫ��
                if(e == x.length) System.out.print(e);
                else System.out.print(e+"��");
            }
        }
    }
}
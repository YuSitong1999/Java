import java.util.Date;
public class Eval{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("һ���еĵڼ��죿 "+String.format("%te", date));
        System.out.println("���Ի����·ݼ��ȫ�ƣ� "+String.format("%tb", date)+String.format("%tB", date));
        System.out.println("���Ի������ڼ��ȫ�ƣ� "+String.format("%ta", date)+String.format("%tA", date));
        System.out.println("ȫ������ʱ����Ϣ"+String.format("%tc", date));

        System.out.println(String.format("%tY", date)+" "+String.format("%ty", date));
        System.out.println(String.format("%tm", date));
        System.out.println(String.format("%tj", date)+" "+String.format("%td",date));

    }
}
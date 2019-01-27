import java.util.Date;
public class Eval{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("一月中的第几天？ "+String.format("%te", date));
        System.out.println("语言环境月份简称全称？ "+String.format("%tb", date)+String.format("%tB", date));
        System.out.println("语言环境星期简称全称？ "+String.format("%ta", date)+String.format("%tA", date));
        System.out.println("全部日期时间信息"+String.format("%tc", date));

        System.out.println(String.format("%tY", date)+" "+String.format("%ty", date));
        System.out.println(String.format("%tm", date));
        System.out.println(String.format("%tj", date)+" "+String.format("%td",date));

    }
}
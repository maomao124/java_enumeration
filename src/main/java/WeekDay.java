/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Enum(枚举名): WeekDay
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 15:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public enum WeekDay
{
    Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday");
    // 以上是枚举的成员，必须先定义，而且使用分号结束
    private final String day;

    private WeekDay(String day)
    {
        this.day = day;
    }

    public static void printDay(int i)
    {
        switch (i)
        {
            case 1:
                System.out.println(WeekDay.Mon);
                break;
            case 2:
                System.out.println(WeekDay.Tue);
                break;
            case 3:
                System.out.println(WeekDay.Wed);
                break;
            case 4:
                System.out.println(WeekDay.Thu);
                break;
            case 5:
                System.out.println(WeekDay.Fri);
                break;
            case 6:
                System.out.println(WeekDay.Sat);
                break;
            case 7:
                System.out.println(WeekDay.Sun);
                break;
            default:
                System.out.println("wrong number!");
        }
    }

    public String getDay()
    {
        return day;
    }

    public static void main(String[] args)
    {
        for (WeekDay day : WeekDay.values())
        {
            System.out.println(day + "====>" + day.getDay());
        }
        WeekDay.printDay(5);
        WeekDay.printDay(3);
    }
}

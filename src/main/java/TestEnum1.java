/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Class(类名): TestEnum1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 14:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TestEnum1
{
    enum Signal
    {
        // 定义一个枚举类型
        GREEN, YELLOW, RED;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < Signal.values().length; i++)
        {
            System.out.println("索引" + Signal.values()[i].ordinal() + "，值：" + Signal.values()[i]);
        }
    }
}

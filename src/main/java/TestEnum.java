/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Enum(枚举名): TestEnum
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 14:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public enum TestEnum
{
    male, female;
}

class t
{
    public static void main(String[] args)
    {
        compare(TestEnum.valueOf("male"));    // 比较
    }

    public static void compare(TestEnum s)
    {
        for (int i = 0; i < TestEnum.values().length; i++)
        {
            System.out.println(s + "与" + TestEnum.values()[i] + "的比较结果是：" + s.compareTo(TestEnum.values()[i]));
        }
    }
}

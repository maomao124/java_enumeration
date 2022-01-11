/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 14:45
 * Version(版本): 1.0
 * Description(描述)：
 * 枚举是一个被命名的整型常数的集合，用于声明一组带标识符的常数。枚举在曰常生活中很常见，例如一个人的性别只能是“男”或者“女”，
 * 一周的星期只能是 7 天中的一个等。类似这种当一个变量有几种固定可能的取值时，就可以将它定义为枚举类型。
 * 在 JDK 1.5 之前没有枚举类型，那时候一般用接口常量来替代。而使用 Java 枚举类型 enum 可以更贴近地表示这种常量。
 * 声明枚举
 * 声明枚举时必须使用 enum 关键字，然后定义枚举的名称、可访问性、基础类型和成员等。枚举声明的语法如下：
 * enum-modifiers enum enumname:enum-base {
 * enum-body,
 * }
 * 其中，enum-modifiers 表示枚举的修饰符主要包括 public、private 和 internal；enumname 表示声明的枚举名称；
 * enum-base 表示基础类型；enum-body 表示枚举的成员，它是枚举类型的命名常数。
 * 任意两个枚举成员不能具有相同的名称，且它的常数值必须在该枚举的基础类型的范围之内，多个枚举成员之间使用逗号分隔。
 * 提示：如果没有显式地声明基础类型的枚举，那么意味着它所对应的基础类型是 int。
 * 枚举类
 * Java 中的每一个枚举都继承自 java.lang.Enum 类。当定义一个枚举类型时，每一个枚举类型成员都可以看作是 Enum 类的实例，
 * 这些枚举成员默认都被 final、public, static 修饰，当使用枚举类型成员时，直接使用枚举名称调用成员即可。
 * 所有枚举实例都可以调用 Enum 类的方法
 * 方法名称	描述
 * values()	以数组形式返回枚举类型的所有成员
 * valueOf()	将普通字符串转换为枚举实例
 * compareTo()	比较两个枚举成员在定义时的顺序
 * ordinal()	获取枚举成员的索引位置
 */

enum SexEnum
{
    male, female;
}

enum Color
{
    RED, BLUE, GREEN, BLACK;
}

enum Signal
{
    GREEN, YELLOW, RED
}

public class test
{
    Signal color = Signal.RED;

    public void change()
    {
        switch (color)
        {
            case RED -> color = Signal.GREEN;
            case YELLOW -> color = Signal.RED;
            case GREEN -> color = Signal.YELLOW;
        }
    }
}

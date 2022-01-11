/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 15:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test1
{
    public enum Color
    {
        RED("红色", 1), GREEN("绿色", 2), WHITE("白色", 3), YELLOW("黄色", 4);
        // 成员变量
        private String name;
        private int index;

        // 构造方法
        private Color(String name, int index)
        {
            this.name = name;
            this.index = index;
        }

        // 覆盖方法
        @Override
        public String toString()
        {
            return this.index + "-" + this.name;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Color.RED.toString());    // 输出：1-红色
        System.out.println(Color.GREEN.toString());
        System.out.println(Color.YELLOW.toString());
        System.out.println(Color.WHITE.toString());
    }
}

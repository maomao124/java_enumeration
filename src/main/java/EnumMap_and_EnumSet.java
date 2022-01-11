import java.util.EnumMap;

/**
 * Project name(项目名称)：Java枚举
 * Package(包名): PACKAGE_NAME
 * Class(类名): EnumMap_and_EnumSet
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 15:14
 * Version(版本): 1.0
 * Description(描述)：
 * 为了更好地支持枚举类型，java.util 中添加了两个新类：EnumMap 和 EnumSet。使用它们可以更高效地操作枚举类型。
 * EnumMap 类
 * EnumMap 是专门为枚举类型量身定做的 Map 实现。虽然使用其他的 Map（如 HashMap）实现也能完成枚举类型实例到值的映射，但是使用 EnumMap 会更加高效。
 * HashMap 只能接收同一枚举类型的实例作为键值，并且由于枚举类型实例的数量相对固定并且有限，所以 EnumMap 使用数组来存放与枚举类型对应的值，使得 EnumMap 的效率非常高。
 * EnumSet 类
 * EnumSet 是枚举类型的高性能 Set 实现，它要求放入它的枚举常量必须属于同一枚举类型。EnumSet 提供了许多工厂方法以便于初始化
 * 方法名称	描述
 * allOf(Class<E> element type)	创建一个包含指定枚举类型中所有枚举成员的 EnumSet 对象
 * complementOf(EnumSet<E> s)	创建一个与指定 EnumSet 对象 s 相同的枚举类型 EnumSet 对象，
 * 并包含所有 s 中未包含的枚举成员
 * copyOf(EnumSet<E> s)	创建一个与指定 EnumSet 对象 s 相同的枚举类型 EnumSet 对象，
 * 并与 s 包含相同的枚举成员
 * noneOf(<Class<E> elementType)	创建指定枚举类型的空 EnumSet 对象
 * of(E first,e...rest)	创建包含指定枚举成员的 EnumSet 对象
 * range(E from ,E to)	创建一个 EnumSet 对象，该对象包含了 from 到 to 之间的所有枚举成员
 */

// 定义数据库类型枚举
 enum DataBaseType
{
    MYSQL,ORACLE,DB2,SQLSERVER
}

public class EnumMap_and_EnumSet
{
    // 某类中定义的获取数据库URL的方法以及EnumMap的声明
    private EnumMap<DataBaseType,String> urls = new EnumMap<DataBaseType,String>(DataBaseType.class);
    public void DataBaseInfo()
    {
        urls.put(DataBaseType.DB2,"jdbc:db2://localhost:5000/sample");
        urls.put(DataBaseType.MYSQL,"jdbc:mysql://localhost/mydb");
        urls.put(DataBaseType.ORACLE,"jdbc:oracle:thin:@localhost:1521:sample");
        urls.put(DataBaseType.SQLSERVER,"jdbc:microsoft:sqlserver://sql:1433;Database=mydb");
    }
    //根据不同的数据库类型，返回对应的URL

    public String getURL(DataBaseType type)
    {
        return this.urls.get(type);
    }
}

public enum Signal1
{
    GREEN, YELLOW, RED;

    public static void main(String[] args)
    {
        for (int i = 0; i < Signal.values().length; i++)
        {
            System.out.println("枚举成员：" + Signal1.values()[i]);
        }
    }
}

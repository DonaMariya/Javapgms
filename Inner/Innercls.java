package Inner;
class Outercls
{
    int a=10;
    class Innercls{
        public int display()
        {
        return a;
        }
    }
}

public class Innercls {
    public static void main(String[] args)
    {
        Outercls o = new Outercls();
        Outercls.Innercls i=o.new Innercls();
        System.out.println(i.display());
    }
    
}

package name;
abstract class calcu
{
    abstract int add(int a, int b);
}
public class Driver
{
    public static void main(String[] args)
    {
        int result = new calcu()
        {    
            int add(int a, int b)
            {
                return a+b;
            }
        }.add(11010, 022011);
    }
}

interface DoStuff2 
{ 
                float getRange(int low, int high);
}
interface DoMore
{ 
                float getAvg(int a, int b, int c); 
} 
abstract class DoAbstract implements DoStuff2, DoMore 
{ } 
class DoStuff implements DoStuff2 
{ 
                public float getRange(int x, int y) 
                { 
                                return 3.14f; 
                }
} 
interface DoAll extends DoMore 
{             
                float getAvg(int a, int b, int c, int d);
} 


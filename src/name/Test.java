package name;

class Icecream{
    public void displayName(String... s){
        System.out.println(s+" " +"Icecream");
    }    
    public void describe(String s) {
        System.out.println(s+" " +"Icecream: Ice cream is a sweetened frozen food typically eaten as a snack or dessert. ");
    }
}
class Faloodeh extends Icecream {
    public void displayName (String s){
        System.out.println(s+" " +"Faloodeh ");
    }
    
    public void describe (String s) {
        System.out.println(s+" "+"Faloodeh:  Faloodeh is often served alongside Persian-style dairy-based ice cream ");
    }    
}
//public class Test {
//    public static void main(String arg[]) {
//       Icecream a=new Faloodeh ();
//       Faloodeh b=( Faloodeh)a;
//        a.displayName ("test"); 
//        b.displayName ("test");
//        a. describe ("test");
//        b. describe ("test");
//    }
//}

abstract class Shape
{
    int i = 111, j = 222;
    abstract void calcArea();
    abstract void calcVolume();
}
 abstract class Quadrilateral extends Shape
{
    void calcArea()
    {
        System.out.println(i);
     }
}
class Square extends Quadrilateral
{
    void calcVolume()
    {
        System.out.println(j);
     }
}
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Square c = new Square();
//         c.calcArea();
//         c.calcVolume();
//     }
//
//}

abstract class Demo
{
    public int a;
    Demo()
    {
        a = 10;
    }
     abstract public void set(); 
}
//class Test extends Demo
//{
//     final public void get()
//    {
//        System.out.println("a = " + a);
//    }
//     public static void main(String[] args)
//    {
//        Test obj = new Test();
//        obj.get();
//    }
//}






package name;

class Tree { } 
class Pine extends Tree { } 
class Oak extends Tree { } 
public class Forest1 
{ 
    public static void main (String [] args)
    { 
        Tree tree = new Pine(); 
        if( tree instanceof Pine ) 
            System.out.println ("Pine"); 
        else if( tree instanceof Tree ) 
            System.out.println ("Tree"); 
        else if( tree instanceof Oak ) 
            System.out.println ( "Oak" ); 
        else 
            System.out.println ("Oops "); 
    } 
}


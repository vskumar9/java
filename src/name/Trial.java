package name;

class A
{
    public void test()
    {
        System.out.println("Class A");
    }
}
public class Trial extends A
{
    public void test()    
    {
        
    }
    public static void main(String args[])
    {
    	String regexPattern = "^PROD\\d{15}$";
    	String inputString = "PROD123456789012345";

    	if (inputString.matches(regexPattern)) {
    	    System.out.println("The string matches the pattern.");
    	} else {
    	    System.out.println("The string does not match the pattern.");
    	}

    	System.out.printf("%-15s%-15s%-15s%-15s%-15s%-30s%-15s","Product ID", "Product Name", "Description", "Unit Price", "Supplier Name", "Supplier Address", "Industry/Category");
    	System.out.println();
    	System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//    	System.out.printf("%15s Class Trial", "sanjeev");
//        Trial object = (Trial)new A();
//        object.test(); 
    	
//    	int numberOfSpaces = 5;
//        String textToPrint = "Hello, World!";

        // Format the string with a specified width
//        String formattedText = String.format("%" + numberOfSpaces + "s%s", "", textToPrint);
        // Print the formatted text
//        System.out.println(formattedText);
    }
}


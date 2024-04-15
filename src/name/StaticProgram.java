package name;

class Stac{
	static String name;
	String name1;
	
//	public Stac() {
//		name = "null";
//		name1 = null;
//	}
//	public void setName(String name1) {
////		this.name = name;
//		this.name1 = name1;
//	}
	
	public String toString() {
		return name+" "+name1;
	}
	
}



public class StaticProgram {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stac s = new Stac();
		s.name = "name";
		Stac s1 = new Stac();
		s1.name1 = "Sanjeev";
		
		System.out.println(s1);
		System.out.println(s);
	}

}

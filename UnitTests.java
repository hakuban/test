package test;




public class UnitTests {
	 UnitTests() {  print();   }
	   void print() { System.out.println("A"); }
	
	

		
}
		  
		class B extends UnitTests{
		   int i =   4;
	public static void main(String[] args){
		      UnitTests a = new B();
		      a.print();
		   }
		   void print() { System.out.println(i); }
		}
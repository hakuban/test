package test;

public class Msg {
	
		   public static String doMsg(char x) {
		   return "Good Day!";
		   }
		   public static String doMsg(int y) {
		   return "Good Luck!";
		   }
		   public static void main(String[] args) {
		       char x = 8;
		       int z = '8';
		       System.out.println(doMsg(x));
		       System.out.print(doMsg(z));
		       
		       int[] arr=new int[3];
		       int [] arr1= {1,2,3,4,5,6,7,8,9,10};
		       arr=arr1;
		       for(int i: arr) {
		    	   System.out.println(i);
		       }
		       
		       
		} }


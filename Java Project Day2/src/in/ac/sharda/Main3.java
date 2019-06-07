package in.ac.sharda;

public class Main3 {

	public static void main(String[] args){
		Main3 m = new Main3();
		int result = m.sum(2,3);
		System.out.println(m.sum(2,3));
		String c = m.sum("ab" , "cd");
		System.out.println(m.sum("ab" , "cd"));
 }
    public int sum(int a,int b) {
    	return a+b;
    } 
    public String sum(String a, String b) {
    	return a+b;
    	
    }
    
 }

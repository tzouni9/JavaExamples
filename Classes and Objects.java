public class Classes{
	public static void main(String[] args){
	
	String s1 = " has won ? ";
	String name = "Nick";

	class User{
	
		int score;
				
		public boolean hasWon(){
			if (score >= 100){
				return true;
			} else {
				return false;
			}
		}
	}
	
	User Nick = new User();
	Nick.score = 10;
	
	System.out.println(Nick.score);
	System.out.println(name + s1 + Nick.hasWon());
			
	}
}
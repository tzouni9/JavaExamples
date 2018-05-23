public class Main {
	public static void main(String[] args){
		
		class Number {
		
		int number;
		
		public boolean isSquare(){
		
		double squareRoot = Math.sqrt(number);     //Math.sqrt  Square
		
		if (squareRoot == Math.floor(squareRoot)){
		System.out.println("Square Root "+ squareRoot);
			return true;
		} else {
			return false;
		}
		}
			
		public boolean isTriangular(){
			int x = 1;
			int triangularNumber = 1;				
			
			while (triangularNumber < number){
				x++;
				triangularNumber = triangularNumber + x; 
				System.out.println("Triangular Number " + triangularNumber);	
			}
				
			if (triangularNumber == number){
				return true;
			} else {
			return false;
			}		
		}
		
		}
		Number myNumber = new Number();
		myNumber.number = 100;
		System.out.println("Is triangular ? " + myNumber.isTriangular());	
		System.out.println("Have Square ? " + myNumber.isSquare());
	}
}
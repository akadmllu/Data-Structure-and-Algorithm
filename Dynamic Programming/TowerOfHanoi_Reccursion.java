
public class TowerOfHanoi_Reccursion {

	public static void main(String[] args) {
		
		TowerOfHanoi(3, 'A', 'B', 'C');
		
	}
	public static void TowerOfHanoi(int n,char fromPeg, char toPeg, char auxPeg) {
		//System.out.println(n + " " + fromPeg + " " + toPeg + " "+ auxPeg);
		if(n == 1) {
			System.out.println("Move disk 1 from peg "+ fromPeg + " to peg " + toPeg);
			return;
		}
		TowerOfHanoi(n-1,fromPeg,auxPeg,toPeg);
		System.out.println("Move disk "+ n +" from peg " + fromPeg + " to peg "+toPeg);
		TowerOfHanoi(n-1, auxPeg, toPeg, fromPeg);
	}

}

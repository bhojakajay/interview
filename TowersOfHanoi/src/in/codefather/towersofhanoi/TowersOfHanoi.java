package in.codefather.towersofhanoi;

public class TowersOfHanoi {
	public static void towersOfHanoi(
			final int n, 
			final String sourcePeg,
			final String destinationPeg, 
			final String auxiliaryPeg
			) 
	{
		if(n==1) {
			System.out.println("Move disc from " + sourcePeg + " to destination peg " + destinationPeg);
			return;
		}
		towersOfHanoi(n-1, sourcePeg, auxiliaryPeg, destinationPeg);
		System.out.println("Move disc from " + sourcePeg + " to destination peg " + destinationPeg);
		towersOfHanoi(n-1, auxiliaryPeg, destinationPeg, sourcePeg);
	}
}

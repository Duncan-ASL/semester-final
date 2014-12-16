

import org.asl.karelx.Squarebot;

import edu.fcps.karel2.Display;

public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
		// TODO Load a default map 
		 Display.setSize(10, 10);
		   Display.setSpeed(10);
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		   Squarebot rex = new Squarebot(9,3);
		   rex.layCorners(5);
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
		   Sentry t = new Sentry(9,3,Display.NORTH, 0);
		   t.patrol();
		   
	}

}

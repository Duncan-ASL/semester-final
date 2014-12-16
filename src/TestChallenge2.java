
import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		// TODO Load the "pasture" map at size 15 by 15
		Display.openWorld("src/pasture.map");
        Display.setSize(15, 15);
        Display.setSpeed(3);
		// TODO Create an instance of a Horse inside the pasture
        Horse rex = new Horse(5,3);
		// TODO Have the horse wander for 36 steps with a timer of 7
        rex.wander(36, 7);
		// TODO Have the horse explode()
        rex.explode();
	}

}

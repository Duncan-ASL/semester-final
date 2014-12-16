import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge3 {
	// TODO Complete the BeepFarmer class, provided, by implementing the reap() method

	public static void main(String[] args) {
		// TODO Load the "farm" map at set its size to 12 by 12
		Display.openWorld("src/farm.map");
        Display.setSize(12, 12);
        Display.setSpeed(3);
		// TODO Create an instance of a BeepFarmer with no beepers, anywhere on the farm
        BeepFarmer rex = new BeepFarmer(3,5);
		// TODO Have the farmer gather all the beepers from the garden plot in the center of the map
        rex.reap(3,5);
		// TODO Have the farmer drop at location (1, 1) all the beepers picked and then move aside.
        rex.teleport(1,1);
        while(rex.hasBeepers())
        {
        	rex.putBeeper();
        }
        rex.sideStepRight();
	}

}

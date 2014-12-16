

import org.asl.karelx.Wanderer;

/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	// TODO Add one or more constructors, as needed
	public Horse(int x, int y) {
		super(x, y);
	}

	/**
	 * Wander around in random directions until a specified number of steps have
	 * been taken. At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count
	 *            the total number of steps to take
	 * @param timer
	 *            the interval at which to drop a beeper
	 * 
	 *            Ex. horse.wander(13, 4) should drop a beeper every four steps
	 *            until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
		int y = 0;
		int ran = 0;
		int ti = (int) count / timer;
		int rest = count%timer;
		for (int b = 0; b < ti; b++) 
		{

			for (int x = 0; x < timer; x++) 
			{
				ran = (int) (Math.random() * 4);
				for (int a = 0; a < ran; a++) 
				{
					turnLeft();
				}
				while(!frontIsClear())
				{
					turnLeft();
				}
				move();
			}
			putBeeper();

		}
		for (int x = 0; x < rest; x++) 
		{
			ran = (int) (Math.random() * 4);
			for (int a = 0; a < ran; a++) 
			{
				turnLeft();
			}
			while(!frontIsClear())
			{
				turnLeft();
			}
			move();
		}
	}
}




import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	public Sentry(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
	}

	// Provide one or more constructors, as you wish

	/**
	 * Patrol an area in a clockwise direction.
	 * 
	 * Move forward until next to a beeper then turn right. Repeat indefinitely.
	 *
	 */
	public void patrol() {
		move();
		while (true) 
		{
			while (!nextToABeeper()) 
			{
				move();
			}
			turnLeft();
			move();
		}
	}
}

package strategypattern;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" Fly no way");
	}
}

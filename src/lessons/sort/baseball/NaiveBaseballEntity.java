package lessons.sort.baseball;

import lessons.sort.baseball.universe.BaseballEntity;
import lessons.sort.baseball.universe.BaseballWorld;

public class NaiveBaseballEntity extends BaseballEntity {

	public NaiveBaseballEntity() {
		super();
	}
	
	/* BEGIN TEMPLATE */
	public void run() {
		/* BEGIN SOLUTION */
		while (!isSorted()) {
			int baseNext = (getHoleBase()+1) % getBasesAmount();
			int posNext = -1;
			int maxDistance = -1;
			for (int pos=0;pos<getPositionsAmount();pos++) {
				int player = getPlayerColor(baseNext, pos);
				int distance = (baseNext - player + getBasesAmount()) % getBasesAmount();
				if (distance > maxDistance) {
					maxDistance = distance;
					posNext = pos;
				}
//				System.out.println(world.toString()+"  baseNext:"+baseNext+" player:"+player+"  distance:"+distance+" (#bases:"+getBasesAmount()+")");
			}
//			System.out.println("move "+baseNext+","+posNext);
			move(baseNext,posNext);
		}
		((BaseballWorld) world).assertSorted("naive sort");
		/* END SOLUTION */
	}
	/* END TEMPLATE */

}

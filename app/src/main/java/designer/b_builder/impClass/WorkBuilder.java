package designer.b_builder.impClass;

import designer.b_builder.absClass.Build;

/**
 * 建造者具有全部功能方法
 */

public class WorkBuilder  implements Build {
	private Room room=new Room();
	@Override
	public void makeWindow() {
		room.setFloor("地板  ");
	}

	@Override
	public void makeFloor() {
		room.setWindow("窗户");
	}

	@Override
	public Room getRoom() {
		return room;
	}

}

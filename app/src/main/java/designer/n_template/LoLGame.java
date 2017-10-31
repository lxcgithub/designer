package designer.n_template;

public class LoLGame extends Game {
	
	@Override
	void initialize() {
		System.out.println("初始化英雄联盟");
	}
	
	@Override
	void startPlay() {
		System.out.println("攻入敌方战场");
	}
	
	@Override
	void endPlay() {
		System.out.println("每打赢，失败，退出游戏");
	}
	
}

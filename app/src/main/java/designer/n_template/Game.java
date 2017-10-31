package designer.n_template;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	
	public final void play()
	{
		System.out.println("游戏开机");
		//初始化游戏
		initialize();
		
		//开始游戏
		startPlay();
		
		//结束游戏
		endPlay();
		
		System.out.println("游戏关机");
		
	}
}

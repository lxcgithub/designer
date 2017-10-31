package designer.l_memento;

/**
 * @author:lenovo
 * @date:2017/10/31
 * 通过将当前状态封装成类进行状态保存。
 */

public class CallOfDuty {
	private double mUpdate = 1;
	
	public void play() {
		mUpdate = 0.5;
	}
	
	public void quit() {
		System.out.println("当前进度："+this.toString());
	}
	
	@Override
	public String toString() {
		return "CallOfDuty{" +
				"mUpdate=" + mUpdate +
				'}';
	}
	
	public Memoto createMemoto(){
		Memoto memoto = new Memoto();
		memoto.mUpdate = mUpdate;
		return memoto;
	}
	
	public void restore(Memoto memoto) {
		this.mUpdate = memoto.mUpdate;
	}
}

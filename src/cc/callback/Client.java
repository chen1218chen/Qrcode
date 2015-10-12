package cc.callback;

//caller
public class Client {
	private Callback callback;

	public Client(Callback cb) {
		this.callback = cb;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	public void show() {
		System.out.println("client product!!");
		callback.call();
	}
}

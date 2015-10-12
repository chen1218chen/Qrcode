package cc.callback;

public class Test {
	public static void main(String[] args) {
		Client client = new Client(new Callback() {

			@Override
			public void call() {
				// TODO 自动生成的方法存根
				System.out.println("server2 callback");
			}

		});
		
		Client c = new Client(new Server());
		c.show();
		client.show();
	}
}

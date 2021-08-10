package ch09_1_inner;

class Button {
	static interface OnClickListener {
		void onClick();
		
	}
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
		
	}
class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
	System.out.println("전화를 겁니다.");
		
	}
	
}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn =new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
	}

}

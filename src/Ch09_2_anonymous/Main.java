package Ch09_2_anonymous;

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
class window {
	
	Button button1=new Button(); 
	Button button2=new Button();
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}	
	};
	public window () {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
	
}
public class Main {
	public static void main(String[] args) {
		window win = new window();
		win.button1.touch();
		win.button2.touch();
	}
}

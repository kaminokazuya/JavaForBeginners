package デフォルト;

public class RectIf extends MyFrame {

	public void run() {
		int x=30;
		setColor(0,0,0);
		int i;
		int j = 0;
		for(i=0;i<10;i++) {
			   fillRect(x,30,10,100);
			   setColor(x,x,x);
			   x+=20;
		}
		for(i=0;i<10;i++) {
			x-=20;
			fillRect(230+20*i,30,10,100);
			setColor(x,x,x);
		}
		
	}

}

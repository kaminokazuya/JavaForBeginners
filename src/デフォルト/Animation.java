package デフォルト;

public class Animation extends MyFrame {
	/*public void run() {
		int y=100;
		int x=30;
		while(x<=170) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
		while(y<=200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
		}
	  }*/
	//5-1
	/*public void run() {
		int y=200;
		int x=30;
		while(y>=100) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.1);
		}
		while(x<=170) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
	}*/
	//5-2
	/*public void run() {
		int y=100;
		int x=30;
		while(x<=200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			y+=5;
			sleep(0.1);
		}
		while(x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
		}
		while(y>=100) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			y-=5;
			sleep(0.1);
		}
	}*/
	//5-3
	/*public void run() {
		int y=100;
		int x=30;
		for(int i=0;i<3;i++) {
			while(x<=170) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			while(x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=5;
				sleep(0.1);
			}
		}
		
	}*/
	//5-EX
	/*public void run() {
		int y=100;
		int x=30;
		while(true) {
			while(x<=170) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			while(y<=200) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=5;
				sleep(0.1);
			}
			while(x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=5;
				sleep(0.1);
			}
			while(y>=100) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y-=5;
				sleep(0.1);
			}
		}
	 }*/
	
	public void run() {
		int y=100;
		int x=30;
		while(true) {
			while(x<=170) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			for(int i=0;i<20;i++) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=5;
				sleep(0.1);
			}
			while(x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=5;
				sleep(0.1);
			}
			for(int i=0;i<20;i++) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=5;
				sleep(0.1);
			}
		}
	 }
}

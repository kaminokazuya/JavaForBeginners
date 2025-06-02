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
	//5-EX2
	/*public void run() {
		int y=100;
		int x=30;
		int count=1;

		while(true) {
			if(count%2==1) {
				x+=10;
			} else if(count%2==0) {
				x-=10;
			}
			int z=0;
			while(x<=170 && x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				if(count%2==1) {
				   x+=5;
				}else if(count%2==0){
					x-=5;
				}
				sleep(0.1);
			}
			while(z<20) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=5;
				z+=1;
				sleep(0.1);
			}
			count+=1;
		}
	 }*/
}
	

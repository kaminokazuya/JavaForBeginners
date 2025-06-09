package デフォルト;

public class Truck extends Vehicle {
	public Truck(int x,int y,int vx,int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x+60, y, 20,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x, y+40, 10,10);
		frame.fillOval(x+10, y+40, 10, 10);
		frame.fillOval(x+60, y+40, 10, 10);
	}

}

package デフォルト;

public class DisplayFaceAndTree extends MyFrame {

	/*public void run() {
		Face face1=new Face(50,50,10,5);
		Tree tree1=new Tree(200,100,-10,-5);
		for (int i=0; i<30; i++) {
			clear();
			face1.draw(this);
			tree1.draw(this);
			face1.move();
			tree1.move();
			sleep(0.1);
		}
	}*/
	
	public void run() {
		Car car1=new Car(30,100,10,0);
		Car car2=new Car(330,180,-10,0);
		for (int i=0; i<30; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.move();
			car2.move();
			sleep(0.1);
		}
	}
}

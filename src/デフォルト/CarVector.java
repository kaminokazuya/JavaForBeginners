package デフォルト;

import java.util.Vector;

public class CarVector extends MyFrame {

	public void run() {
		Vector<Car> Cars=new Vector<Car>();
		Cars.add(new Car(30,50,1,0));
		Cars.add(new Car(30,120,2,0));
		Cars.add(new Car(30,190,3,0));
		Cars.add(new Car(30,260,4,0));
		Cars.add(new Car(30,330,5,0));
		for (int i=0; i<30; i++) {
			clear();
			for (int j=0; j<Cars.size(); j++) {
				Cars.get(j).draw(this);
				Cars.get(j).move();
			}
			sleep(0.1);
		}
	}

}

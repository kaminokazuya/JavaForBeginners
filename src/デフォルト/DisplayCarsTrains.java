package デフォルト;

import java.awt.Window;

public class DisplayCarsTrains extends MyFrame {
	public void run() {
		Vehicle[] Vehicles=new Vehicle[6];
		Vehicles[0]=new Car(10,30,3,0);
		Vehicles[1]=new Car(150,100,-3,0);
		Vehicles[2]=new Train(10,170,3,0);
		Vehicles[3]=new Train(150,240,-3,0);
		Vehicles[4]=new Truck(10,310,3,0);
		Vehicles[5]=new Truck(150,370,-3,0);
		for(int i=0; i<60; i++) {
			clear();
			for (int j=0; j<Vehicles.length; j++) {
				Vehicles[j].draw(this);
				Vehicles[j].move();
			}
			sleep(0.1);
		}
	}
}

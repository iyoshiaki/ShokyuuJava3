import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(80,30,3,0));
		vehicles.add(new Car(90,90,-5,0));
		vehicles.add(new Train(10,150,7,0));
		vehicles.add(new Train(70,220,-7,0));
		vehicles.add(new Truck(10,260,7,0));
		vehicles.add(new Truck(70,300,7,0));
		
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
		
	}

}

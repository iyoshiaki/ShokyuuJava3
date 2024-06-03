import java.util.Vector;

public class DisplayCar extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,60,1,5));
		cars.add(new Car(50,120,2,5));
		cars.add(new Car(50,180,3,5));
		cars.add(new Car(50,240,4,5));
		cars.add(new Car(50,300,5,5));
		
		for (int i = 0; i < 30; i++) {
			clear();
			for(int j = 0; j<cars.size();j++)
			{
				cars.get(j).draw(this);
				cars.get(j).move();
			}	
			
			sleep(0.1);
		}
	}
}

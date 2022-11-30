

public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammel mammel1 = new Mammel("Josh the gorilla");
		Gorilla gorilla1 = new Gorilla();
		Bat bat1 = new Bat();
		
		mammel1.display();
		mammel1.lowerEnergy(10, "banana");
		
		gorilla1.display();
		gorilla1.yelling();
		
		bat1.display();
		bat1.lowerEnergy(50, "Fire");

		
	}

}

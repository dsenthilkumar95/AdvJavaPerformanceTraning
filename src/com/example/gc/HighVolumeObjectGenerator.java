package com.example.gc;

public class HighVolumeObjectGenerator {
	
	Car car6 = null;
	
	public static void main(String[] args) throws InterruptedException  {
		new HighVolumeObjectGenerator();
	}

	public HighVolumeObjectGenerator() throws InterruptedException {
		for(int i=0;i<200;i++) {
			Car car1 = null; //reference variable
			car1 = new Car(100+i,new String("X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1"+i),new String("BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW "+i),1260000.00+i);

			new Thread(() -> {
				try{
					generate();
				}catch(InterruptedException e){}
			}).start();
	
			car1 = null;
		}
		Thread.sleep(2000);
		System.out.println("Done!!!!!");
	}

	void generate() throws InterruptedException {
		System.out.println("Entered generate()!!!!");
	
		for(int i=0;i<100;i++) {
			 //reference variable and object creation
			Car car2 = new Car(100+i,new String("X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1"+i),new String("BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW "+i),1260000.00+i);

			 //reference variable and object creation
			Car car3 = new Car(100+i,new String("X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1"+i),new String("BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW "+i),1260000.00+i);

			new Thread(() -> {
				try {
					generateMore(car3);
				}catch(InterruptedException e){}
			}).start();
	
		}	
		Thread.sleep(2000);
		System.out.println("Left generate()!!!!");

	}

	void generateMore(Car car) throws InterruptedException {
		System.out.println("Entered generateMore()!!!!");
		Car car4 = car; //reference variable copied 
		new Thread(() -> {
			try {
				generateSomeMore();
			}catch(InterruptedException ex){}
		}).start();
		Thread.sleep(3000);
		System.out.println("Left generateMore()!!!!");
	}

	void generateSomeMore() throws InterruptedException {
		System.out.println("Entered generateSomeMore()!!!!");

		for(int i=0;i<20;i++) {
			Car car5 = null;
			car5 = new Car(100+i,new String("X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X11 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1  X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1 X1"+i),new String("BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW W BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW W BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMWW BMW  BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW BMW"+i),1260000.00+i);
			car6 = car5;
			car5 = null;
		}
		Thread.sleep(2000);
		System.out.println("Left generateSomeMore()!!!!");
	}

}

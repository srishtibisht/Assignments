package p1;

public class Car extends Vehicle{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getClass()+" Move() ");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(getClass()+" startEngine() ");
	}
	
	public void close(){}

}

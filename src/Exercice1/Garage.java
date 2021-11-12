package Exercice1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class Garage extends Car{
	private int id;
	private int nbCar = 0;
	private ArrayList<Car> Cars;
	private Garage(String brand, long value, int vetuste, int id, int nbCar, ArrayList<Car> cars) {
		super(brand, value);
		this.id = id;
		this.nbCar = nbCar;
		Cars = cars;
	}
	public void add(Car c) {
		Objects.requireNonNull(c);
		ListIterator<Car> car = Car.listIterator();
		Car ca = null;
		while (car.hasNext()) {
			ca = car.next();
			if (c.compareTo(ca)) {
			}
			else {
				car.previous();
				((Garage) car).add(c);
				return;
			}
		}
		ca.add(c);
	}
	public int getId() {
		return id;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Car c : Cars) {
			s.append(c).append(",");
		}
		return s.toString();
	}
	public int somme() {
		return this.nbCar;
	}
	public String firstCarByBrand(String brand){
		for( Car c: Cars){
			if(c.getBrand()==brand){
				return c.getBrand();
			}
		}
		System.out.println("Il n ya pas une voiture de cette marsque");
		return null;
	}
	public void protectionism(String brand) {
		Objects.requireNonNull(brand);

		ArrayList<Car> l = new ArrayList<Car>();
		for (Car c : Cars) {
			if (c.getBrand() == brand) {
				l.add(c);
			}
		}
		Cars.removeAll(l);
	}
}
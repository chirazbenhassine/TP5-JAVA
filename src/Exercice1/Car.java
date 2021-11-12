package Exercice1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Car{
	protected final String Brand ;
	private final long Value;
	private int vetuste=0;

	/**
	 * 
	 * @return
	 */
	public String getBrand() {
		return Brand;
	}
	/**
	 * 
	 * @return
	 */
	public long getValue() {
		return Value;
	}

	public Car(String brand, long value) {
		if (value <= 0) {
			System.out.println(" Impossible de créer une voiture avec une valeur négative");
			throw new IllegalArgumentException();
		}
		this.Brand = brand;
		this.Value = value;
		this.vetuste=vetuste;
	}
	/**
	 * Méthodes toString pour afficher les caractréstiques de voiture
	 */
	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", Value=" + Value + ", vetuste=" + vetuste + "]";
	}
	public boolean compareTo(Car ca) {
		if (!(ca instanceof Car)) {
			return false;
		}

		if (!super.equals(ca)) {
			return false;
		}

		Car c = (Car) ca;
		if (this.Value == c.Value) {
			return true;
		}
		return false;
	}
	public static ListIterator<Car> listIterator() {
		return null;
	}
	public void add(Car c) {
		// TODO Auto-generated method stub

	}
}

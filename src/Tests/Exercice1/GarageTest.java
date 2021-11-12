package Exercice1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GarageTest {

		@Test
		public void testAjoutCar() {
			ArrayList<Car> list = new ArrayList<>();
			Car car=new Car("BMW",1000);
			Car car1= new Car("Audi",20000);
			list.add(car1);
			list.add(car);
			assertAll(list.toString());
		}
		@Test
		public void testsommeCars() {
			ArrayList<Car> list = new ArrayList<>();
			Car car=new Car("BMW",1000);
			Car car1= new Car("Audi",20000);
			list.add(car1);
			list.add(car);
			Assertions.assertEquals(4, list.size());
			
		}
		@Test
		public void testFirstByBrand() {
			ArrayList<Garage> list = new ArrayList<>();
			Car car=new Car("BMW",1000);
			Car car1= new Car("Audi",20000);
			list.add((Garage) car1);
			list.add((Garage) car);
			//assertEquals(car1.getBrand(),list.firstCarByBrand("BMW"));
			}
		}



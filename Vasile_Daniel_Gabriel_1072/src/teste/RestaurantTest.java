package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.MeniuBasic;
import clase.MeniuPranz;
import clase.Restaurant;

public class RestaurantTest {
	
	//testare unicitate instante restaurant
	@Test
	public void unicitateSingleton() throws Exception {
		Restaurant restaurant1 = Restaurant.getRestaurant();
		Restaurant restaurant2 = Restaurant.getRestaurant();
		assertSame(restaurant1,restaurant2);
	}
	
	@Test
	public void testFactory() throws Exception {
		Restaurant restaurant = Restaurant.getRestaurant();
		MeniuBasic mBasic=(MeniuBasic)restaurant.creazaMeniu("basic", "meniu basic", 50);
		MeniuPranz mPranz=(MeniuPranz)restaurant.creazaMeniu("pranz","meniu pranz", 10);
		assertNotSame(mBasic,mPranz);
	}
	
	
}

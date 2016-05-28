package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AbonatiTest.class, AngajatiTest.class, ComandaTest.class, RestaurantTest.class })
public class AllTests {

}

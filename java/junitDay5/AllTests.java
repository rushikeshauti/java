package junitDay5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({  TC001_j.class, TC001_Junit.class })
public class AllTests {

}

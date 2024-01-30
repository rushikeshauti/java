package junitDay5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC001_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" this is the Beforeclass");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" this is the Afterclasss");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println(" this is the Before");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println(" this is the After");
	}
	@Test
	public void test() {
		System.out.println(" this is the Test");
	}
	@Test
	public void test2() {
		System.out.println(" this is the Test2");
	}
}

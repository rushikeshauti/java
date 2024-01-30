package junitDay5;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class Datejunit {


		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void test() {
			DateAssert d1 = new DateAssert(11,01,2023);
			System.out.println(d1.toString());
			assertEquals("Date is 11/1/2023",d1.toString());
		
	}

}

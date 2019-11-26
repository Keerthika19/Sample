import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestName {
	
	

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
	public void testFullName() {
		Person p1=new Person("Keerthi","V");
		String name=p1.getFullName();
		assertEquals("Keerthi V",name);
	}
	
	@Test
	public void testFirstName() {
		Person p2=new Person("Keerthi","V");
		assertNotNull("First name is null",p2.getFirstName());
	}
	
	@Test
	public void testGetFirstName() {
		Person p3=new Person("Keerthi","V");
		assertEquals("Keerthi",p3.getFirstName());
	}
	
	@Test
	public void testLastName() {
		Person p4=new Person("Keerthi","V");
		assertEquals("V",p4.getLastName());
	}
	
	@Test (expected= IllegalArgumentException.class)
	public void testException(){
		Person p=new Person(null, null);
	}

}

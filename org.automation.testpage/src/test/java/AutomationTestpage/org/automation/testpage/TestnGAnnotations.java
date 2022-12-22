package AutomationTestpage.org.automation.testpage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestnGAnnotations {
	@Test
	public void test1() {
		System.out.println("test1");
	}
   @Test
	public void test2() {
		System.out.println("test2");
	}
   @Test
	public void test3() {
		System.out.println("test3");
	}
   @Test
	public void test4() {
		System.out.println("test1");
	}
   @BeforeMethod
	public void before() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void after() {
		System.out.println("AfterMethod");
	}
}

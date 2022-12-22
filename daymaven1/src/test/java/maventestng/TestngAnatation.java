package maventestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnatation {
	@BeforeSuite
	public void method1() {
		System.out.println("Method1 Output");
	}
	
	@BeforeTest
	public void method2() {
		System.out.println("Method2 Output");
	}
	
	@BeforeMethod
	public void method3() {
		System.out.println("Method3 Output");
	}
	@Test
	public void method4() {
		System.out.println("Method4 Output");
	}
	@Test
	public void method5() {
		System.out.println("Method5 Output");
	}
	@BeforeClass
	public void method6() {
		System.out.println("Method6 Output");
	}
	

}

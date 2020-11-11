package in.lti.day12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class ReflectionExample {
	@Test
	public void f() throws Exception {
		// Passing a class with package name for Inspection purpose
		Class cl = Class.forName("org.openqa.selenium.chrome.ChromeDriver");

		Method[] mt = cl.getDeclaredMethods();

		for (Method m : mt) {
			System.out.println(m.getName());
		}

		System.out.println(cl.getSuperclass());

		Field[] fd = cl.getDeclaredFields();
		System.out.println("Fields are as Below>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>----");

		for (Field f : fd) {
			System.out.println(f.getName());
		}
		
		System.out.println("MEthods are as Below------------------>>");
		Method[] mt2 = cl.getMethods();  // From Parent

		for (Method m : mt2) {
			System.out.println(m.getName());
		}
	}
}
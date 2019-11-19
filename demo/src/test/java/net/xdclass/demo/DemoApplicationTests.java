package net.xdclass.demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Test
	public void TestOne() {
		System.out.println("测试");
		TestCase.assertEquals("1", "1");
	}

	/**
	 * 执行方法前执行
	 */
	@Before
	public void TestBefore(){
		System.out.println("before");
	}

	/**
	 * 执行方法后执行
	 */
	@After
	public void TestAfter(){
		System.out.println("After");
	}

}

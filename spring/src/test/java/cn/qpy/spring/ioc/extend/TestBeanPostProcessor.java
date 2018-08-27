package cn.qpy.spring.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanPostProcessor {

	public static final String appConfPath = "spring/ioc/extend/beanPostProcessor/appConfig.xml";

	@Test
	public void test() {
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appConfPath);
	}

}
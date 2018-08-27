package cn.qpy.spring.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.qpy.spring.ioc.extend.beanFactoryPostProcessor.A;

public class TestBeanFactoryPostProcessor {

	public static final String appConfPath = "spring/ioc/extend/beanFactoryPostProcessor/appConfig.xml";

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appConfPath);
		A a = (A) ctx.getBean(A.class);
		System.out.println(a.getName());
	}

}
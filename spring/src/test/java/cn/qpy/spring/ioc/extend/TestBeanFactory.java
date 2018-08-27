package cn.qpy.spring.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.qpy.spring.ioc.extend.factoryBean.A;
import cn.qpy.spring.ioc.extend.factoryBean.AFactory;

public class TestBeanFactory {

	public static final String appConfPath = "spring/ioc/extend/factoryBean/appConfig.xml";

	@Test
	public void test() {
		@SuppressWarnings({ "resource" })
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appConfPath);
		System.out.println("spring context start success");
		A a = (A) ctx.getBean("aFactory");
		AFactory aFactory = (AFactory) ctx.getBean("&aFactory");
		System.out.println(a.getName());
		System.out.println(aFactory.getName());
	}

}
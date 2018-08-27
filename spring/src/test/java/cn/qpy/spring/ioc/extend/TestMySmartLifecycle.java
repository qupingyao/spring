package cn.qpy.spring.ioc.extend;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMySmartLifecycle {

	public static final String appConfPath = "spring/ioc/extend/smartLifecycle/appConfig.xml";

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(appConfPath);
		ctx.close();
	}

}

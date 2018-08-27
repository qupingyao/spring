package cn.qpy.spring.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.qpy.spring.ioc.extend.applicationListener.MyEventSource;

public class TestApplicationListener {

	public static final String appConfPath = "spring/ioc/extend/applicationListener/appConfig.xml";

	@Test
	public void test() {
		@SuppressWarnings({ "resource" })
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appConfPath);
		MyEventSource source = (MyEventSource) ctx.getBean(MyEventSource.class);
		source.publishEvent();
	}
}

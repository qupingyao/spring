package cn.qpy.spring.ioc.extend.initializingBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class A implements InitializingBean {

	public A() {
		System.out.println("create a");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("do A-afterPropertiesSet()");
	}

}

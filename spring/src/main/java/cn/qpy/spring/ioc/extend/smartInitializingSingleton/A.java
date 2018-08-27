package cn.qpy.spring.ioc.extend.smartInitializingSingleton;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Component
public class A implements SmartInitializingSingleton {

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("do A-afterSingletonsInstantiated()");
	}

}

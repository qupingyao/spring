package cn.qpy.spring.ioc.extend.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("do MyPostProcessor-postProcessBeforeInitialization(),beanName:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("do MyPostProcessor-postProcessAfterInitialization(),beanName:" + beanName);
		return bean;
	}

}

package cn.qpy.spring.ioc.extend.beanPostProcessor;

import java.beans.PropertyDescriptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(
				"do MyInstantiationAwareBeanPostProcessor-postProcessBeforeInitialization(),beanName:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(
				"do MyInstantiationAwareBeanPostProcessor-postProcessAfterInitialization(),beanName:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(
				"do MyInstantiationAwareBeanPostProcessor-postProcessBeforeInstantiation(),beanName:" + beanName);
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(
				"do MyInstantiationAwareBeanPostProcessor-postProcessAfterInstantiation(),beanName:" + beanName);
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("do MyInstantiationAwareBeanPostProcessor-postProcessPropertyValues(),beanName:" + beanName);
		return pvs;
	}

}

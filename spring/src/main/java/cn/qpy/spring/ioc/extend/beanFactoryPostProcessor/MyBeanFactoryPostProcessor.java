package cn.qpy.spring.ioc.extend.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		System.out.println("create myBeanFactoryPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurablelistablebeanfactory)
			throws BeansException {
		System.out.println("do MyBeanFactoryPostProcessor-postProcessBeanFactory()");
	}

}

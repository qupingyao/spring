package cn.qpy.spring.ioc.extend.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	private String name;

	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("create myBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("do MyBeanDefinitionRegistryPostProcessor-postProcessBeanFactory()");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("do MyBeanDefinitionRegistryPostProcessor-postProcessBeanDefinitionRegistry()");
		BeanDefinition define = registry.getBeanDefinition("a");
		MutablePropertyValues map = define.getPropertyValues();
		map.addPropertyValue("name", name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

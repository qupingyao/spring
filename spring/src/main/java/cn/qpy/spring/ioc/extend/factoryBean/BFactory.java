package cn.qpy.spring.ioc.extend.factoryBean;

import org.springframework.beans.factory.SmartFactoryBean;

public class BFactory implements SmartFactoryBean<B> {

	private String name;

	public BFactory() {
		System.out.println("create bFactory");
	}

	@Override
	public B getObject() throws Exception {
		return new B(name);
	}

	@Override
	public Class<B> getObjectType() {
		return B.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public boolean isPrototype() {
		return false;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

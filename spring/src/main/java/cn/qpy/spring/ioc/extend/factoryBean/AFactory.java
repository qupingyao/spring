package cn.qpy.spring.ioc.extend.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class AFactory implements FactoryBean<A> {

	private String name;

	public AFactory() {
		System.out.println("create aFactory");
	}

	@Override
	public A getObject() throws Exception {
		return new A(name);
	}

	@Override
	public Class<A> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

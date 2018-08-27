package cn.qpy.spring.ioc.extend.factoryBean;

public class A {

	private String name;

	public A(String name) {
		System.out.println("create a");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package cn.qpy.spring.ioc.extend.beanPostProcessor;

public class A {

	private String name;

	public A() {
		System.out.println("create a");
	}

	public void say() {
		System.out.println("do A-say()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("do A-setName()");
		this.name = name;
	}

}

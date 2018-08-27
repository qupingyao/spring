package cn.qpy.spring.ioc.extend.factoryBean;

public class B {

	private String name;

	public B(String name) {
		System.out.println("create b");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package cn.qpy.spring.ioc.extend.smartInitializingSingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	@Autowired
	private A a;

	public B() {
		System.out.println("create b");
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}

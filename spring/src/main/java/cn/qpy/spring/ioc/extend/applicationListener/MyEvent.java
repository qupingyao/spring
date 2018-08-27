package cn.qpy.spring.ioc.extend.applicationListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyEvent extends ApplicationContextEvent {

	private static final long serialVersionUID = 1L;

	public MyEvent(ApplicationContext source) {
		super(source);
	}

}

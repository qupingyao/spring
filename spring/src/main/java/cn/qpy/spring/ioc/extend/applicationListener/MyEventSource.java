package cn.qpy.spring.ioc.extend.applicationListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyEventSource {

	@Autowired
	private ApplicationContext applicationContext;

	public void publishEvent() {
		System.out.println("do MyEventSource-publishEvent()");
		MyEvent event = new MyEvent(applicationContext);
		applicationContext.publishEvent(event);
	}
}

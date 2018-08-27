package cn.qpy.spring.ioc.extend.applicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent myEvent) {
		System.out.println("find myEvent happen");
	}
}

package cn.qpy.spring.ioc.extend.smartLifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class MySmartLifecycle implements SmartLifecycle {

	private boolean isRunning = false;

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}

	@Override
	public void start() {
		System.out.println("do MySmartLifecycle-start()");
		isRunning = true;
	}

	/**
	 * spring接口设计的缺陷,该方法只对直接实现接口Lifecycle的类才起作用，对实现SmartLifecycle接口的类无效
	 */
	@Override
	public void stop() {
		System.out.println("do MySmartLifecycle-stop()");
		isRunning = false;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println("do MySmartLifecycle-stop(Runnable callback)");
		isRunning = false;
	}

}
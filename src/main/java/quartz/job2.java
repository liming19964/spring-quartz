package quartz;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class job2 {
	static Desktop deskapp = Desktop.getDesktop();

	public void doJob2() {
		try {
			//inputQQ();
			openQQ();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static  void openQQ() {
		// 判断当前系统释放支持Desktop提供的接口
		if (Desktop.isDesktopSupported()) {
			try {
				Robot robot = new Robot();
				deskapp.open(new File("D:\\QQ\\Bin\\QQScLauncher.exe"));
				robot.delay(3000);
				TestInput.keyPress(robot, KeyEvent.VK_ENTER);
				robot.delay(3000);
				TestInput.keyPressString(robot, "ghl");
				robot.delay(3000);
				TestInput.keyPress(robot, KeyEvent.VK_ENTER);
				// 点击鼠标左键(目的是让光标放到QQ上)
				//TestInput.mouseLeftHit(robot);
				for (int i = 0; i < 10; i++) {
				// 输入爱心
				TestInput.keyPressString(robot, "/xin");

				// 按下回车
				TestInput.keyPress(robot, KeyEvent.VK_ENTER);
				System.out.println(i);
							
				}
				robot.delay(1000);
				TestInput.keyPressClose(robot);
				robot.delay(1000);
				TestInput.keyPressAtlWithCtrlWithZ(robot);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void inputQQ() throws AWTException {
		Robot robot = new Robot();
		// 3等待3秒后开始执行下面的自动键盘事件
		// robot.delay(3000);

		TestInput.keyPressAtlWithCtrlWithZ(robot);
		robot.delay(3000);
		TestInput.keyPressString(robot, "ghl");
		robot.delay(3000);
		TestInput.keyPress(robot, KeyEvent.VK_ENTER);
		// 点击鼠标左键(目的是让光标放到QQ上)
		//TestInput.mouseLeftHit(robot);
		for (int i = 0; i < 10; i++) {
		// 输入爱心
		TestInput.keyPressString(robot, "/xin");

		// 按下回车
		TestInput.keyPress(robot, KeyEvent.VK_ENTER);
		System.out.println(i);
					
		}
		robot.delay(3000);
		TestInput.keyPressClose(robot);
		robot.delay(3000);
		TestInput.keyPressAtlWithCtrlWithZ(robot);
	}
}

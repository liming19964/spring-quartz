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
		// �жϵ�ǰϵͳ�ͷ�֧��Desktop�ṩ�Ľӿ�
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
				// ���������(Ŀ�����ù��ŵ�QQ��)
				//TestInput.mouseLeftHit(robot);
				for (int i = 0; i < 10; i++) {
				// ���밮��
				TestInput.keyPressString(robot, "/xin");

				// ���»س�
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
		// 3�ȴ�3���ʼִ��������Զ������¼�
		// robot.delay(3000);

		TestInput.keyPressAtlWithCtrlWithZ(robot);
		robot.delay(3000);
		TestInput.keyPressString(robot, "ghl");
		robot.delay(3000);
		TestInput.keyPress(robot, KeyEvent.VK_ENTER);
		// ���������(Ŀ�����ù��ŵ�QQ��)
		//TestInput.mouseLeftHit(robot);
		for (int i = 0; i < 10; i++) {
		// ���밮��
		TestInput.keyPressString(robot, "/xin");

		// ���»س�
		TestInput.keyPress(robot, KeyEvent.VK_ENTER);
		System.out.println(i);
					
		}
		robot.delay(3000);
		TestInput.keyPressClose(robot);
		robot.delay(3000);
		TestInput.keyPressAtlWithCtrlWithZ(robot);
	}
}

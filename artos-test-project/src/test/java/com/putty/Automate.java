package com.putty;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Automate {
	public void method1() throws InterruptedException, AWTException
	{
		Runtime r = Runtime.getRuntime();
		Process p;

		//String username = "anything";
		//String password = "anything";
		String serverString = "NZSR8GARIMAB";
		String s = "C:\\Program Files\\PuTTY\\putty.exe -ssh -l " +serverString+"";
		try
		{
			//open the putty session with the above given username, password and server
			p = r.exec(s);
			Thread.sleep(3000);

		} catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		Thread.sleep(2000);

		Robot robot = new Robot();
		
		/*
		 * robot.keyPress(KeyEvent.VK_S); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_U); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_D); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_O); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_S); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_U); Thread.sleep(150);
		 * robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(150); robot.keyPress(109);
		 * Thread.sleep(150); robot.keyPress(KeyEvent.VK_ENTER);
		 */
		
		Thread.sleep(150);

	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		Automate auto = new Automate();
	    //Calling the methods
	    auto.method1();
	}

}

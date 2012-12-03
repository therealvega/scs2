package control;

import java.awt.EventQueue;

import model.Patient;

import view.PatientFrame;

public class controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//*****Patient
		Patient p = new Patient();
		final PatientFrame frame = new PatientFrame();
		
		

		//***** GUI *****
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//***************
		
		//***** testThread
		Clock c = new Clock(p);
		c.setFrame(frame);
		Thread t1 = new Thread(c);
		t1.start();
		

		
		
	}

}




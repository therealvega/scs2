package control;

import view.PatientFrame;
import model.Patient;

public class Clock implements Runnable{
	
	private Patient p;
	private PatientFrame f;
	
	Clock(Patient pat){
		p=pat;
		
	}
	
	public void setFrame(PatientFrame fff){
		f = fff;
	}
	
		
	  @Override public void run()
	  {
	try {
		    for ( int i = 0; i < 20; i++ ){
		      System.out.println( "Pulse" );
		      	p.setBloodGlucoseLevel(i*10);
		      	f.setTxtBloodGlucoseLevel(Integer.toString(p.getBloodGlucoseLevel()));
				Thread.sleep(1000);
		    }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	  }
}

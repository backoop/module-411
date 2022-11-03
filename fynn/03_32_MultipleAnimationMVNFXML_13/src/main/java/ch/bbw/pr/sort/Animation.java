package ch.bbw.pr.sort;

/**
 * Animation timered simulation
 * @author Peter Rutschmann
 * @version 20.12.2017
 */
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.control.ProgressBar;

public class Animation extends AnimationTimer {
	private long lastUpdate = 0 ;
	private int stepCnt = 0 ;
	private ProgressBar[] myBarArray;
	private ArrayList<Integer[]> list;
	
	public void setup(ProgressBar[] barArray, ArrayList<Integer[]> list)
	{
		this.myBarArray = barArray;
		this.list = list;
		lastUpdate = 0 ;
		stepCnt = 0 ;	
	}
	
	private void updateBar(Integer[] values)
	{
		for (int i = 0; i < values.length; i++) {
			double value = (double) values[i] / 100.0;			
			myBarArray[i].setProgress(value);
		}		
	}
	
    @Override
    public void handle(long now) {
    	if ((now - lastUpdate)>100000000L)
    	{
    		lastUpdate = now;
			if (stepCnt < list.size())
			{
				updateBar(list.get(stepCnt));
				stepCnt++;
			}
			else
			{
				lastUpdate = 0;
				stepCnt = 0;
				stop();
			}
    	}
    }
}

package springhw.aopendtoendservices;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("idNumGen")
public class NumGenerator {
	Random r = new Random();
		
	public double getSqrtSum() {
		double f=0;
		int x=0, n=5, s=3, time=1;
		
		for (int i=0; i<s;i++) {
			//-------- Задержка на time мс
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {				
				//e.printStackTrace();
			}
			//----------------------------
			x=r.nextInt(n);
		
			
			  if (x<=0) throw new ArithmeticException("Под знаком корня отрицательное значение");
			  f=f+Math.sqrt(x);		 
		}	   
		return f;
	 }
}
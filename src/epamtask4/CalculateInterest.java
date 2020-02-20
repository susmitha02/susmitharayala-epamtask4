
package epamtask4;
import java.util.*;



	public class CalculateInterest {
		double simple,comp;
		Scanner sc=new Scanner (System.in);
	
	    public  void findSimpleInterest(double pr,double rate,double t)
	    {
	    	
	       simple=(pr * t * rate)/100;
	        System.out.println(simple);
	    
	    }
	    public void  findCompoundInterest(double pr,double rate,double t){
	    	
	    comp=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    System.out.println(comp);
	    }
	    

	}



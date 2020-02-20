package epamtask4;


	import java.util.Scanner;

	public class Interest
	{
	    public static void main( String[] args ) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	double pr, rate, t;
	    	CalculateInterest  s=new CalculateInterest();
	    	System.out.println("Enter the amount:");
	        pr=sc.nextDouble();
	        System. out. println("Enter the No.of years:");
	        t=sc.nextDouble();
	        System. out. println("Enter the Rate of  interest");
	        rate=sc.nextDouble();
	    	System.out.println("1.SimpleInterest");
	    	System.out.println("2.Compound Interest");
	    	System.out.println("Enter your option:");
	    	int n=sc.nextInt();
	    	switch(n) {
	    	case 1: 
	    		
	              s.findSimpleInterest(pr,rate,t);
	               break;
	    	case 2:
	    		   s.findCompoundInterest(pr,rate,t);
	    		   break;
	    
	    		default:
	    			System.out.println("Select from 1-2");
	    }
	    	sc.close();
	    	
	}
	}

		



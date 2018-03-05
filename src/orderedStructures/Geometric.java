package orderedStructures;

import exceptions.InvalidIndexException;

public class Geometric extends Progression {

	private double commonFactor ;
	private double firstValue ;
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor ; 
		this.firstValue = firstValue ;
	}
	
	@Override
	public double nextValue() {
		/******* Exercise 6 *********/
		if ( !super.init )
		{
			throw new InvalidIndexException ( "Invalid index" ) ;
		}
		current = current * commonFactor; 
		return current;
	}
	
	
	/******************* Exercise 3 *****************/
	public String toString ()
	{
		return "("+ (int)firstValue +"," + (int)commonFactor + ")" ;
	}

	
	/**************** Exercise 5 *******************/
	public double getTerm(int n) throws IndexOutOfBoundsException { 
        if (n <= 0) 
           throw new IndexOutOfBoundsException(
                 "printAllTerms: Invalid argument value = " + n); 

        double value = this.firstValue()*Math.pow(this.commonFactor, n-1) ; 
        
        return value; 
    }

}

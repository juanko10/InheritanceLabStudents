package orderedStructures;

import exceptions.InvalidIndexException;

public class Arithmetic extends Progression {
	private double commonDifference;
	private double firstValue; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		this.firstValue = firstValue ; 
	}
	
	@Override
	public double nextValue() {
		/******** Exercise 6 *********/
		if ( !super.init )
		{
			throw new InvalidIndexException ( "Invalid index" ) ;
		}
		current = current + commonDifference; 
		return current;
	}
	
	
	/******************* Exercise 3 *****************/
	public String toString ()
	{
		return "("+ (int)firstValue +"," + (int)commonDifference + ")" ;
	}
	
	/****************** Exercise 5 *****************/
	public double getTerm(int n) throws IndexOutOfBoundsException { 
        if (n <= 0) 
           throw new IndexOutOfBoundsException(
                 "printAllTerms: Invalid argument value = " + n); 

        double value = this.firstValue() + (this.commonDifference) * (n-1); 
        
        return value; 
    }
}

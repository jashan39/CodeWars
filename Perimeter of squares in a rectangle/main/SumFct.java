import java.math.BigInteger;

public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		// your code
		
		
	/*************************************************************************
     *  Compute Fibonacci number using Dijkstra's recurrence:
     *    F(2N-1)  = F(N-1)^2 + F(N)^2
     *    F(2N)    = (2 F(N-1) + F(N)) F(N)
     * 
     *  Reference: http://introcs.cs.princeton.edu/java/92symbolic/Fibonacci.java
     *
     *************************************************************************/	
    
    BigInteger first, second, sum, total, counter, decrement, perimeter;
    
    first = new BigInteger("1");  
    second = new BigInteger("1"); 
    sum = new BigInteger("0");  
    total = new BigInteger("0");
    counter = new BigInteger("0");
    decrement = new BigInteger("-1");
    perimeter = new BigInteger("4");


    sum = first.add(second);
    total = total.add(sum);
    n = n.add(decrement);

    while( n.compareTo(counter) == 1){
    
    sum = first.add(second);
    first = second;
    second = sum; 
    total = total.add(sum);
    n = n.add(decrement);
    
    }
    
    total = total.multiply(perimeter);
    return total;
	}
  
}
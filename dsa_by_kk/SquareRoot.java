package dsa_by_kk;

public class SquareRoot {
	
	static double squareRoot(double n) {
		double start,end;
		
		if(n < 1)
			end = 1;
		else
			end = n;
		start = 0;
		
		while(start <= end) {
			double mid = (start+end)/2;
			double midSqure = mid *mid;
			
			if(midSqure == n) {
				return mid;
				
			}else if(midSqure < n) {
				start = mid +1;
			}else
				end  = mid -1;
		}
		return start;	
	}
	
	public static void main(String[] args) {
		int n = (int)squareRoot(25);
		System.out.println(n);
	}

}

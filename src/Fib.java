public class Fib{
public static int FibRecursive(int number) {
	if(number == 0) {
		
		return 0;
	}
	else if(number == 1) {
		return 1;
	}
	
	return(FibRecursive(number - 1) + FibRecursive(number - 2));
	


}

public static int FibIterative(int number) {
	if(number == 1) {
		
		return 0;
	}
	else if(number == 2) {
		return 1;
	}
	int a = 1;
	int ab = 1;
	int thenumber = 0;
	
	for(int i = 2; i < number; i++ )
	{
		thenumber = a + ab;
		a = ab;
		ab = thenumber;
	}
	
	return thenumber;

}

public static void main(String[] args) {
	 int i, number=10,fib1,fib2;
	 
     System.out.print("Number\tRecursive\tIterative\n");
     System.out.print("__\t__________\t__________\n");
     long start_time1;
     long start_time2;
     long end_time1;
     long end_time2;
     int subtract1;
     int subtract2;
     //int l = 10;
     //System.out.println(FibRecursive(l));
     
     for (i = 1; i<= number; i++) 
     {
    	 start_time1 = System.nanoTime();
    	 fib1 = FibRecursive(i);
    	 end_time1 = System.nanoTime();
    	 //
    	 start_time2 = System.nanoTime();
    	fib2 = FibIterative(i);
    	 
    	end_time2 = System.nanoTime();
         subtract1 = (int) (end_time1 - start_time1);
        subtract2 = (int) (end_time2 - start_time2);
    	 System.out.println("\n"+i +"\t"+subtract1+"\t\t"+subtract2);
     }
     
    
	
	
}

}
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 
 */
public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	System.out.println("s ==>" + s + "<== s.length: " + s.length() + " n: " + n);
    	
    	// **** determine how many times a is found in the specified string ****
    	long numOfAs	= 0;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == 'a')
    			numOfAs++;
    	}
    	System.out.println("numOfAs: " + numOfAs);
    	
    	// **** determine the initial count of letter 'a' ****
    	long countOfAs = n / s.length() * numOfAs;
    	System.out.println("countOfAs: " + countOfAs);
    	
    	// **** take into account the instances of 'a' in the rest of the string ****
    	long mod = n % s.length();
    	System.out.println("mod: " + mod);

    	// **** count additional 'a' character(s) ****
    	for (int i = 0; i < mod; i++) {
    		if (s.charAt(i) == 'a')
    			countOfAs++;
    	}
    	System.out.println("countOfAs: " + countOfAs);
   	
    	// **** return the total count of letter 'a' ****
    	return countOfAs;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    
    // **** ****
    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

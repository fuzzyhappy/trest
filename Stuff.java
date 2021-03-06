//MATT WAS HERE
// Example class for Git exercise
// Do not use library functions for any of these

public class Stuff {
    public static void main(String[] args) {
	System.out.println(gcd(81, 135));
    }

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    static int fib(int n) {
	if (n <= 2) {
	   return (1);
	}	
	return (fib(n - 1) + fib(n - 2));	
    }

    // Sorts a list of integers from smallest to largest
    // Build your own - don't use a library sorting method
    static int[] sort(int[] a){
	int smallest =99999;
	int smallIndex = 0;
		for(int i = 0; i < a.length; i++){
			smallest = 99999;
			for(int i2 = 0; i2 < a.length; i2++){
				if(a[i2] < a[i]){
					smallest = a[i2];
					smallIndex = i2;
					}	
				}
			int x = a[i];
			a[i] = a[smallIndex];
			a[smallIndex] = x;
			}
	return (a);
    }

    // Returns the number of occurances of each letter (ABCD...) in a given string
    static int[] letterCount(String s)
    {
	int [] count = new int[26];
	s = s.toLowerCase();
	for (int i = 0; i < s.length(); i++)
	{
	    count[s.charAt(i)-97]++;
	}
	return (count);
    }  

    // Returns the GCD of two numbers
    // Must use Euclid's algorithm
    static int gcd(int a, int b) {
	if (a == 0) {
	   return b;
	}
	return gcd(b % a, a);
    }

    // Returns all prime factors of a number
    static int[] factorize(int a) {
	return (new int[8]);
    }

}


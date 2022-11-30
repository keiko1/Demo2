/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
/*
aabbcc
a = 3, b= 2 ,c = 2
print(A)
what if :
a= 2, b =2, c = 2
print(a)
empty " "
print NO elemnts
*/
import java.util.HashMap;
import java.lang.Math;
import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
	    String str = "nnnnnnnnnnititnnnn".trim();
	    if(str.length() == 0)
	    {
	        System.out.println("NO such elemnts");
	        return ;
	    }
		HashMap<Character, Integer> freqCh = new HashMap();
		for(int i = 0, n = str.length(); i < n ; i++)
		{
		    char ch = str.charAt(i);
		    freqCh.putIfAbsent(ch, 0);
		    int value = freqCh.get(ch) + 1;
		    freqCh.put(ch, value);
		}
		char ch = '\u0000'; 
		int max = -1;
		LinkedHashSet<Character> keys = new LinkedHashSet(freqCh.keySet());
		for(Character ind : keys)
		{
		    if(freqCh.get(ind) > max)
		    {
		        max = freqCh.get(ind);
		        ch = ind;
		    }
		}
		
		System.out.println(ch);
		
	}
}


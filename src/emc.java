import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class emc {
	 
	public void removelink()	{
		//point the next of the current node to the next
		//of the next node
	}
	
	public String convert(String s){
		char[] c = s.toCharArray();
		System.out.println(s);

		for(int i=0; i<c.length; i++)	{
			// arrange identical characters together
			for(int j=i+1;j<c.length;j++)	{
				if(c[i] == c[j]) {
					i++;
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;				
				}
			}
			//System.out.println(c.toString());
		}
		return new String(c);
		
	}
	
	public String convertfast(String s)	{
		char[] c = s.toCharArray();
		System.out.println(s);
		int sort[] = new int[256];
		for(int i=0; i<c.length; i++){
			sort[(int)c[i]]++;
		}
		int count =0;
		for(int i=0; i<sort.length; i++){
			while(sort[i]>0)	{
				c[count] = (char)i; 
				sort[i]--;
				count++;
			}
		}
		return new String(c);
	}
	
	public void recursion(int i)	{
		System.out.println(i);
		if(i<500)	{
			recursion(++i);
		}
	}
	
	public int occur(int[] i, int find)	{
		for(int j=0; j<i.length;j++)	{
			if(i[j] == find){
				return j;
			}
		}
		return -1;
	}
	
	public int[][] printdiag(int[][] arr){
	
		int count2 = 1;
		int count1=1;
		int dem2=0;
		int dem1=0;
		int elements = arr.length * arr[0].length;
		for(int i=0; i<elements; i++)	{
		//	for(int j=count; j>=0;j--)	{
				System.out.print(arr[dem1][dem2]);
				if(dem1==arr[0].length-1)	{
					dem2 = arr.length-1;
					dem1 = count1;
					count1++;
					System.out.println();
				}
				else if(dem2==0) {
					dem1=0;
					dem2 = count2;
					count2++;
					System.out.println();
				}
				else	{
					dem2--;
					dem1++;
				}
			//}
		
		}
		return arr;
	}
	
	public int unique(char[] carray)	{
		int[] map = new int[256];
		int first = -1;
		for(int i=0; i<carray.length;i++)	{
			if(first==-1)	{
				if(map[(int)carray[i]] == 0) 	{
					first=i;
					map[(int)carray[i]] ++;
					System.out.println(first);
				} else	{
					map[(int)carray[i]] ++;
				}
			}
			else if(carray[i] == carray[first])	{
				i=first+1;
				first=-1;				
			}
		}
		return first;
	}
	
	public int firstunique(char[] carray)	{
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		int count = 1;
		for(int i=0; i<carray.length; i++)	{
			if(!hm.containsKey(carray[i]))	{
				hm.put(carray[i], i);
			} else	{
				hm.remove(carray[i]);
			}
		}
		
		char c = hm.keySet().iterator().next();
		int ind = hm.get(c);
		//c= hm.keySet().iterator().next();
		for(char ch: hm.keySet()){
			System.out.println(hm.get(ch));
		}
		System.out.println(c + String.valueOf(ind));
		return ind;
	}

	public int prime(int n)	{
		int primenums = 0;
		for(int i=2; i<n; i++)	{
			boolean primebool = true;
			for(int j=2;j<i;j++)	{
				if(i%j == 0){
					primebool = false;
				}
			}
			if(primebool){
				primenums++;
			}
		}
		return primenums;
	}
	
	public ArrayList<Integer> missing(int[] a1, int[] a2)	{

		ArrayList<Integer> miss = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a1.length; i++)	{
			if(!hm.containsKey(a1[i])) {
				hm.put(a1[i],1);
			} else {
				int count = hm.get(a1[i]) + 1;
				hm.put(a1[i], count);
			}
		}
		
		for(int i=0; i<a2.length; i++) {
			if(hm.containsKey(a2[i])) {
				int count = hm.get(a2[i]) - 1;
				hm.put(a2[i], count);
			} else {

				miss.add(a2[i]);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> e : hm.entrySet())	{
			int value = e.getValue();
			System.out.print(String.valueOf(value));
			while(0 < value) {
				miss.add(e.getKey());
				value--;
			}
		}
		try	{	
		BufferedReader br = new BufferedReader(new FileReader(new File("testfile.txt")));
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
		
		System.out.println();
		return miss;
		
	}
	
	
	
	
	public int filecount()	{
		File f = new File("testfile.txt");
		int num =0;
		try	{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line ="";
			while((line = br.readLine()) != null)	{
				String[] sarray = line.split(" ");
				num += sarray.length;
			}
			
			fr.close();
		} catch(Exception E){
			E.printStackTrace();
		}
		return num;
	}
	
	public String strReverse(String str)	{
		char[] cbuff = str.toCharArray();
		char[] newchar = new char[cbuff.length];
		StringBuilder sb = new StringBuilder();
		
		for(int i=cbuff.length-1, j=0; i>=0; i--, j++){
			newchar[j] = (cbuff[i]);
			sb.append(cbuff[i]);
		}
		
		return sb.toString();
	}
	
	public String revRecurse(String str, int n) {
	

		if(n<str.length()-1)	{
			 StringBuilder sb = new StringBuilder(revRecurse(str, n+1));	
			 sb.append(str.charAt(n));
			 return sb.toString();
		}
		
		else	{			
			return str.substring(n,n+1);
		}
	}
	
	public String reversewithrecurse(String str)	{
		if(str.isEmpty())	{
			return new String("");
		}
		return revRecurse(str,0);
	}
	
	public void swap(int x, int y)	{
		
		System.out.println("Before: X: " + String.valueOf(x) + "Y:" + String.valueOf(y));
		x = x ^ y; 
		y = x ^ y;
		x = x ^ y;
		System.out.println("After: X: " + String.valueOf(x) + "Y:" + String.valueOf(y));

	}

	
	emc()	{

		int[][] dubarray = new int[][]
		{		{1 ,2, 3, 4,6}, 
				{5, 4, 3, 5,7}, 
				{6, 5, 9, 8,9}, 
				{9, 8, 7, 6,1}, 
				{1, 8, 3, 6,2}	
		};
		
	//	printdiag(dubarray);
		String str = "fdasdfasdfas";
		//System.out.println(convert(str));
//		System.out.println(convertfast(str));
		int[] intarr = {1,1,2,3,4,5,5,5,5,5};
//		recursion(0);
		//int index = occur(intarr, 5);
	//	System.out.print("Index: " + String.valueOf(index) + "Value: " + String.valueOf(intarr[index]));
		char[] ar = {'a', 'b', 'c', 'd', 'a', 'b', 'c','k'};
	//	System.out.println(firstunique(ar));
	
	
	//	System.out.println(prime(1000));
		int arr1[] = new int[] {1,2,3,3,3,3,3,3,4,4,4,5,6};
		int arr2[] = new int[] {1,2,4,5,6};
		ArrayList<Integer> a = new ArrayList<Integer>();
		//	a=missing(arr1, arr2);
		//System.out.println(a.get(0));
/*
		for(int i=0; i<a.size(); i++)  {
			System.out.println(a.get(i));
		}
	*/
		
		//System.out.println(String.valueOf(filecount()));
		
	//	System.out.println(strReverse("ReverseR"));

	//	System.out.println(reversewithrecurse("S"));
	//	swap(5, 10);
		
		int[] intarray = new int[] {1,2,3,4};
		//intarray = combo(intarray);
		System.out.println(256>>4);

	}
	
	public static int maxsubarr(int[] arr)  {
		int max = 0;
		int startind=0;
		int endind=0;
		int globalmax = 0;
		int tempstart = 0;
		int tempend=0;
		boolean continuous = false;
		for(int i=0; i<arr.length;i++){
			if(continuous){
				int temp = max+arr[i];
				if(temp<0)	{
					
					max =0;
					continuous = false;
				}	else if(temp>globalmax){
					endind=i;
					max = temp;
					globalmax=temp;
					startind = tempstart;
				} 
				 else	{
					max=temp;
					tempend = i;
				}
				}	  else	{
				if(arr[i]>0)	{
					tempstart = i;
					max = arr[i];
					continuous = true;
				}
			}
			
			
			
		}
		System.out.println(Integer.toString(startind) + Integer.toString(endind));
		return globalmax;

	}
	
	public static int fact(int i)	{
		if(i<1){	
			 return -1;
		} else if(i>1)	{
			return i*fact(i-1);
		} else	{
			return i;
		}
	}
	
	public static void main(String[] s) 
	{  
		//System.out.println(fact(3));
		int[] a = new int[] {4,5,6,7,-100,18,9,-1,3};
		System.out.println(Integer.toString(maxsubarr(a)));
		int[] b = new int[] {1,2,3};
		System.arraycopy(b, 0, a, 5, 2);
		/*for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}*/
		//new emc();
	} 
	
}

package Logical_pgm;

import java.util.Hashtable;

public class Example_Map_DiffBetween_HashMap_And_HashTable
{
public static void main(String[] args)
{
	
	Hashtable ht=new Hashtable<>();
	ht.put("ramesh", 1);
    ht.put("mahesh", null);
	ht.put("ganesh", null);
	ht.put(null, 1);
	System.out.println(ht);
	
}
}
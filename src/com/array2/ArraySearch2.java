package com.array2;

public class ArraySearch2 {
	public static boolean arsrchm(int x,int num[]) {
		
        int y=x;
		
		for (int i = 1; i < (num.length); i++) {
			if (y==num[i]) {
			return true;
			}
		}
		return false;
	
	}
}



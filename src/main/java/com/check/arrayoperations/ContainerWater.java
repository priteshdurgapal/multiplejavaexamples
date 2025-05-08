package com.check.arrayoperations;

public class ContainerWater {
	
	public static int trapping_rain_water(int[] H) {
		 int ans = 0, i = 0, j = H.length-1, res = 0;
	        while (i < j) {
	           
	        int area = (j-i)*Math.min(H[i],H[j]);
	        ans = Math.max(ans, area);
	       if(i<j) {
	    	   i++;
	       }
	       if(i>j) {
	    	   j--;
	       }
	    }
	        return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		int result = trapping_rain_water(arr);
		System.out.println(result);
	}

}

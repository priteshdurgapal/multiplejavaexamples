package com.check.dynamo;

public class DynP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "GTTCCTAATA";
		String y = "CGATAATTGAGA";
		int[][] L = new int[10][12];
		char[] print = reconstructLCS(x.toCharArray(), y.toCharArray(), L);
		for (Character c : print) {
			System.out.println(c);
		}

	}

	public static char[] reconstructLCS(char[] X, char[] Y, int[][] L) {
		StringBuilder solution = new StringBuilder();
		int j = X.length;
		int k = Y.length;
		while (L[j][k] > 0) // common characters remain
			if (X[j - 1] == Y[k - 1]) {
				solution.append(X[j - 1]);
				j--;
				k--;
			} else if (L[j - 1][k] >= L[j][k - 1])
				j--;
			else
				k--;
		// return left-to-right version, as char array
		return solution.reverse().toString().toCharArray();
	}
}

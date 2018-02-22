package com.risingdevs.algorithms.leetcode.bs;


public class GuessGame {
	int ans = 0;
	
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.ans = 1702766719;
		System.out.println(game.guessNumber(2126753390));
	}
	public int guessNumber(int n) {
        int l = 0;
        int r = n;
        int m = 0;
        int g = 0;
        while(l<=r) {
            m = (l+r)/2;
            g = guess(m);
            if(g == 0) {
                return m;
            } else if(g == -1){
                r  = m+1;
            } else {
                l = m-1;
            }
        }
        return 0;
    }

	private int guess(int m) {
		if(m == ans) {
			return 0;
		} else if(ans > m) {
			return -1;
		} else {
			return 1;
		}
	}
	
	
}

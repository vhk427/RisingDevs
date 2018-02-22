package com.risingdevs.algorithms.weekcode36;

import java.util.Scanner;

public class CheckMate {

	static int waysToGiveACheck(char[][] board) {
		int px = 0, py = 0;
		int kx = 0, ky = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'k') {
					kx = i;
					ky = j;
					break;
				}
			}
		}
		int count = 0;
		int i = 1;
		for (int j = 0; j < 8; j++) {
			if (board[i][j] == 'P') {
				board[i][j] = '#';
				px = i - 1;
				py = j;
				if (board[px][py] == '#') {
					count += counter(board, px, py, kx, ky);
				}
				board[i][j] = 'P';
			}
		}
//		if (board[px][py] == '#') {
//			count += counter(board, px, py, kx, ky);
//		}
//		if (py > 0 && board[px][py - 1] != '#') {
//			if (board[px][py - 1] == 'k' || board[px][py - 1] == 'q' || board[px][py - 1] == 'n' || board[px][py - 1] == 'b'
//					|| board[px][py - 1] == 'r' || board[px][py - 1] == 'p') {
//				board[px][py - 1] = '#';
//				count += counter(board, px, py - 1, kx, ky);
//			}
//		}
//		if (py < 7 && board[px][py + 1] != '#') {
//			if (board[px][py+ 1] == 'k' || board[px][py+ 1] == 'q' || board[px][py+ 1] == 'n' || board[px ][py+ 1] == 'b'
//					|| board[px][py+ 1] == 'r' || board[px][py+ 1] == 'p') {
//				board[px][py+ 1] = '#';
//				count += counter(board, px, py+ 1, kx, ky);
//			}
//		}
		return count;
	}

	private static int counter(char[][] board, int px, int py, int kx, int ky) {
		// Calculating number of ways
		// checking for knight
		if (px + 1 == kx && (py - 2 == ky || py + 2 == ky)) {
			return 1;
		}
		// checking for bishap
		else if (kx - px == py - ky) {
			while (kx != ++px) {
				if (board[px][--py] != '#') {
					return 0;
				}
			}
			return 2;
		}
		else if (kx - px == ky - py) {
			while (kx != ++px) {
				if (board[px][++py] != '#') {
					return 0;
				}
			}
			return 2;
		}
		// checking for rook
		else if (px == kx) {
			if (ky > py) {
				while (ky != ++py) {
					if (board[px][py] != '#') {
						return 0;
					}
				}
			}
			else {
				while (ky != --py) {
					if (board[px][py] != '#') {
						return 0;
					}
				}
			}
			return 2;
		}
		else if (py == ky) {
			while (kx != ++px) {
				if (board[px][py] != '#') {
					return 0;
				}
			}
			return 2;
		}
		else {
			// no match
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			char[][] board = new char[8][8];
			for (int i = 0; i < 8; i++) {
				board[i] = in.next().toCharArray();
			}
			int result = waysToGiveACheck(board);
			System.out.println(result);
		}
		in.close();
	}
}

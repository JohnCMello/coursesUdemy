package secao_16_jogo_xadrez.application;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import secao_16_jogo_xadrez.chess.ChessMatch;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.ChessPosition;
import secao_16_jogo_xadrez.chess.Color;

public class UI {

	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j], false);
			}
			System.out.println();
		}

		System.out.println("  a b c d e f g h");

	}

	public static void printBoard(ChessPiece[][] pieces, boolean[][] possibleMoves) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j], possibleMoves[i][j]);
			}
			System.out.println();
		}

		System.out.println("  a b c d e f g h");

	}

	public static void printMatch(ChessMatch match, List<ChessPiece> capturedPieces) {
		printBoard(match.getPieces());
		System.out.println();
		printCapturedPieces(capturedPieces);
		System.out.println();
		System.out.println("Turn : " + match.getTurn());
		if (!match.getCheckMate()) {
			System.out.println("Waiting player: " + match.getCurrentPlayer());
			if (match.getCheck()) {
				System.out.println("CHECK!!");
			}
		} else {
			System.out.println("CHECK MATE!!");
			System.out.println("Winner " + match.getCurrentPlayer() + "!!");
		}

	}

	public static ChessPosition readChessPosition(Scanner sc) {
		try {

			String position = sc.nextLine();
			char column = position.charAt(0);
			Integer row = Integer.parseInt(position.substring(1));

			return new ChessPosition(column, row);
		} catch (RuntimeException error) {
			throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8");
		}

	}

	private static void printPiece(ChessPiece piece, boolean background) {

		if (background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}

		if (piece == null) {
			System.out.print("-" + ANSI_RESET);
		} else {
			if (piece.getColor() == Color.WHITE) {
				System.out.print(ANSI_WHITE + piece + ANSI_RESET);
			} else {
				System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
			}
		}

		System.out.print(" ");
	}

	private static void printCapturedPieces(List<ChessPiece> capturedPieces) {

		List<ChessPiece> whites = capturedPieces.stream().filter(piece -> piece.getColor() == Color.WHITE)
				.collect(Collectors.toList());
		List<ChessPiece> blacks = capturedPieces.stream().filter(piece -> piece.getColor() == Color.BLACK)
				.collect(Collectors.toList());

		System.out.println("------------------------------------------");
		System.out.print(ANSI_WHITE);
		System.out.print("White: ");
		System.out.println(Arrays.toString(whites.toArray()));
		System.out.print(ANSI_RESET);
		System.out.print(ANSI_YELLOW);
		System.out.print("Black: ");
		System.out.println(Arrays.toString(blacks.toArray()));
		System.out.print(ANSI_RESET);
		System.out.println("------------------------------------------");

	}

}

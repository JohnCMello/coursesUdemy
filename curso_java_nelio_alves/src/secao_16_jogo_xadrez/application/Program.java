package secao_16_jogo_xadrez.application;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import secao_16_jogo_xadrez.chess.ChessException;
import secao_16_jogo_xadrez.chess.ChessMatch;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ChessMatch match = new ChessMatch();
		List<ChessPiece> capturedPieces = new ArrayList<>();

		while (!match.getCheckMate()) {
			try {

				UI.clearScreen();
				UI.printMatch(match, capturedPieces);
				System.out.println();

				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = match.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(match.getPieces(), possibleMoves);

				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = match.performChessMove(source, target);

				if (capturedPiece != null) {
					capturedPieces.add(capturedPiece);
				}

				if (match.getPromoted() != null) {
					System.out.print("Enter piece for promotion (B/k/R/Q: ");
					String type = sc.nextLine().toUpperCase();
					while (!type.equals("B") && !type.equals("k") && !type.equals("R") && !type.equals("Q")) {
						System.out.print("Invalid value! Enter piece for promotion (B/k/R/Q: ");
						type = sc.nextLine().toUpperCase();
					}
					match.replacePromotedPiece(type);
				}

			} catch (ChessException error) {
				System.out.println(error.getMessage());
				sc.nextLine();
				;
			} catch (InputMismatchException error) {
				System.out.println(error.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(match, capturedPieces);
	}

}

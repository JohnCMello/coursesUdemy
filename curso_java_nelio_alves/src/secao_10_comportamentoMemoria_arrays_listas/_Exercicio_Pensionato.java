package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Scanner;

public class _Exercicio_Pensionato {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            int room;
            do {
                System.out.print("Room (0-9): ");
                room = sc.nextInt();
                if (room < 0 || room > 9) {
                    System.out.println("Invalid room number. Please choose a number between 0 and 9.");
                } else if (vect[room] != null) {
                    System.out.println("This room is already occupied. Please choose another room.");
                }
            } while (room < 0 || room > 9 || vect[room] != null);
            vect[room] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }

}

class Rent {
	private String name;
	private String email;

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return name + ", " + email;
	}
}
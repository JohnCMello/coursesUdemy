package secao_10_comportamentoMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class _Exercicio_Mais_Velho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int amount;

        System.out.print("Quantas pessoas você vai digitar? ");
        amount = sc.nextInt();

        Person2[] peopleArray = new Person2[amount];

        for (int i = 0; i < peopleArray.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            int age;

            do {
                System.out.print("Idade (maior que 0): ");
                age = sc.nextInt();
            } while (age <= 0);

            peopleArray[i] = new Person2(name, age);
        }

        showResults(peopleArray);

        sc.close();
    }

    private static void showResults(Person2[] peopleArray) {
        int indexOldest = 0;
        int highestAge = peopleArray[0].getAge();

        for (int i = 1; i < peopleArray.length; i++) {
            if (peopleArray[i].getAge() > highestAge) {
                highestAge = peopleArray[i].getAge();
                indexOldest = i;
            }
        }

        System.out.println("Pessoa mais velha: " + peopleArray[indexOldest].getName());
    }
}

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

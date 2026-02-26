import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do Trabalho: ");
        double trabalho = scanner.nextDouble();

        double mediaSemestral = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);

        System.out.printf("Média Semestral: %.2f\n", mediaSemestral);

        if (mediaSemestral >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em exame.");

            double notaCorte = 10 - mediaSemestral;
            System.out.printf("Nota mínima para passar no exame: %.2f\n", notaCorte);

            System.out.print("Digite a nota do exame: ");
            double notaExame = scanner.nextDouble();

            double mediaExame = (mediaSemestral + notaExame) / 2;
            System.out.printf("Média final após exame: %.2f\n", mediaExame);

            if (mediaExame >= 5) {
                System.out.println("Aluno aprovado após exame!");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

        scanner.close();
    }
}
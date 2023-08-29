import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 0;
        double valorSolicitado = 0;

        Scanner scanner = new Scanner(System.in);

        saldo = scanner.nextDouble();
        valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }

    }
}
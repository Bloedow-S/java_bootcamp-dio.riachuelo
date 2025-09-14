import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        //-1 == menor
        if (valor.compareTo(new BigDecimal("50.00")) == -1) {
            descontoPercentual = BigDecimal.ZERO;
        }
        else if (valor.compareTo(new BigDecimal("101.00")) == -1) {
            descontoPercentual = BigDecimal.TEN;
        }
        else {
            descontoPercentual = new BigDecimal("20");
        }

        return String.format("Desconto de %s%%", descontoPercentual);
    }
}
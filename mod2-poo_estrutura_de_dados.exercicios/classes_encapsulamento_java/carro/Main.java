import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Car car = new Car();

    public static void main(String[] args) {
        while (true) {
            String[] menu = {
                    "1 - Ligar carro",
                    "2 - Desligar carro",
                    "3 - Subir marcha",
                    "4 - Descer marcha",
                    "5 - Acelerar",
                    "6 - Desacelerar",
                    "7 - Virar para esquerda",
                    "8 - Virar para direita",
                    "9 - Verificar velocidade",
                    "0 - Sair"
            };

            System.out.println("------------------");
            for (String option : menu) {
                System.out.println(option);
            }
            System.out.print("Digite uma opção: ");
            var optionInput = scanner.nextInt();

            switch (optionInput) {
                case 1 -> car.start();
                case 2 -> car.turnOff();
                case 3 -> car.upshift();
                case 4 -> car.downshift();
                case 5 -> car.accelerate();
                case 6 -> car.slowDown();
                case 7 -> car.toTurn("esquerda");
                case 8 -> car.toTurn("direita");
                case 9 -> verifySpeed();
                case 0 -> System.exit(0);
                default -> System.out.println("(!) Digite um valor válido!");
            }
        }
    }

    private static void verifySpeed() {
        System.out.printf("Velocidade atual: %d\n", car.getSpeed());
    }
}

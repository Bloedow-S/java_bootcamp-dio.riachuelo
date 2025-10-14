import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> removePetFromMachine();
                case 9 -> cleanTheMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

        } while (true);
    }

    private static void cleanTheMachine() {
        petMachine.wash();
    }

    private static void removePetFromMachine() {
        petMachine.removePet();
    }

    private static void setPetInMachine() {
        var name = "";

        while (name == null || name.isEmpty()) {
            System.out.print("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

    private static void checkPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Há um pet na máquina!\n" : "A máquina está desocupada!");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.printf("A máquina possui %d litro(s) de shampoo atualmente\n", amount);
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.printf("A máquina possui %d litro(s) de água atualmente\n", amount);
    }

    private static void setShampoo() {
        petMachine.addShampoo();
    }

    private static void setWater() {
        petMachine.addWater();
    }
}

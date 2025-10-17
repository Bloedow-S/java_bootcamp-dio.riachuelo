import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        do {
            String[] optionsList = {
              "1 - Verificar se tem pet no banho",
              "2 - Colocar pet na máquina",
              "3 - Dar banho no pet",
              "4 - Verificar água",
              "5 - Verificar shampoo",
              "6 - Abastecer a máquina com água",
              "7 - Abastecer a máquina com shampoo",
              "8 - Retirar pet da máquina",
              "9 - Limpar a máquina",
              "0 - Sair",
            };

            System.out.println("---------------------------------------");
            for (String option : optionsList) { //imprime cada opção do menu/array
                System.out.println(option);
            }
            System.out.print("--> Digite a opção desejada: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkAPetInMachine();
                case 2 -> putAPetInMachine();
                case 3 -> takeAShower();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> waterSupply();
                case 7 -> shampooSupply();
                case 8 -> removeThePet();
                case 9 -> washTheMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }

    private static void removeThePet() {
        petMachine.removePetFromMachine();
    }

    private static void shampooSupply() {
        petMachine.addShampoo();
    }

    private static void waterSupply() {
        petMachine.addWater();
    }

    private static void washTheMachine() {
        petMachine.washMachine();
    }

    private static void verifyShampoo() {
        int amount = petMachine.getShampoo();
        System.out.printf("Nível de shampoo: %d\n", amount);
    }

    private static void verifyWater() {
        int amount = petMachine.getWater();
        System.out.printf("Nível de água: %d\n", amount);
    }

    private static void takeAShower() {
        petMachine.takeAShowerInAPet();
    }

    private static void putAPetInMachine() {
        String name = null;
        String owner = null;

        while (name == null || name.isEmpty()) {
            System.out.print("Digite o nome do pet: ");
            name = scanner.next();
        }

        while (owner == null || owner.isEmpty()) {
            System.out.print("Digite o nome do dono: ");
            owner = scanner.next();
        }

        var pet = new Pet(name, owner);
        petMachine.setAPetInMachine(pet);
    }

    private static void checkAPetInMachine() {
        if(petMachine.hasPet()) {
            System.out.println("A máquina está ocupada por um pet!");
        } else {
            System.out.println("Não há nenhum pet na máquina!");
        }
    }
}

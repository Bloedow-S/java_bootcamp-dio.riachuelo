public class PetMachine {

    private boolean cleanMachine = true;
    private Pet pet;
    private int water = 30;
    private int shampoo = 10;

    PetMachine() {}

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public void addWater() {
        if (this.water == 30 ) {
            System.out.println("Ação cancelada!\nLimite máximo de água atingido!");
            return;
        }
        this.water += 2;
        System.out.printf("Adicionado 2l de água.\nQuantidade atual: %d\n", getWater());
    }

    public void addShampoo() {
        if (this.shampoo == 10) {
            System.out.println("Ação cancelada!\nLimite máximo de shampoo atingido!");
            return;
        }
        this.shampoo += 2;
        System.out.printf("Adicionado 2l de shampoo.\nQuantidade atual: %d\n", getShampoo());
    }

    public boolean hasPet() {
        return pet != null; //se pet é diferente de nulo então Existe!
    }

    public void setAPetInMachine(Pet pet) {
        if (hasPet()) {
            System.out.printf("A máquina está ocupada pelo pet %s!\n", this.pet.getName());
            return;
        }
        if (!cleanMachine)  { //se cleanMachine for False
            System.out.println("Máquina suja! Realize a limpeza antes de utilizar.");
            return;
        }
        this.pet = pet;
        System.out.printf("O pet %s foi colocado na máquina!\n", this.pet.getName());
    }

    public void reportInsufficientQuantity(String product) {
        System.out.printf("Quantidade de %s insuficiente!\nEncha até o limite máximo!\n", product);
    }

    public void takeAShowerInAPet() {
        if (this.pet == null) {
            System.out.println("Antes do banho coloque o pet na máquina!");
            return;
        }
        if (water < 10) {
            reportInsufficientQuantity("água");
            return;
        }
        if (shampoo < 2) {
            reportInsufficientQuantity("shampoo");
            return;
        }
        water -= 10;
        shampoo -= 2;
        this.pet.setCleanPet(true);
        System.out.println("O banho foi realizado!");
    }

    public void removePetFromMachine() {
        this.pet = null;
        cleanMachine = false;
        System.out.println("O pet foi removido da máquina!");
    }

    public void washMachine() {
        if (this.water < 3) {
            reportInsufficientQuantity("água");
            return;
        }
        if (this.shampoo < 1) {
            reportInsufficientQuantity("shampoo");
            return;
        }
        water -= 3;
        shampoo -= 1;
        this.cleanMachine = true;
        System.out.println("A limpeza da máquina foi realizada!");
    }
}

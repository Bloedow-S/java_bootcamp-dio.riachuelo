public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("Banho realizado!");
    }

    public void addWater() {
        if (this.water == 30) {
            System.out.println("Ação cancelada!\nO nível de água está no limite máximo!");
            return;
        }
        this.water += 2;
        System.out.println("Água adicionada!");
    }

    public void addShampoo() {
        if (this.shampoo == 10) {
            System.out.println("Ação cancelada!\nO nível de shampoo está no limite máximo!");
            return;
        }
        this.shampoo += 2;
        System.out.println("Shampoo Adicionado!");
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (!clean) {
            System.out.println("Máquina suja!\nRealizar limpeza antes de utilizar.");
            return;
        }
        if (hasPet()) {
            System.out.printf("A máquina está ocupada pelo pet %s\n", this.pet.getName());
            return;
        }
        this.pet = pet;
        System.out.printf("O pet %s foi colocado na máquina!\n", this.pet.getName());
    }

    public void removePet() {
        this.clean = false;
        System.out.printf("O pet %s foi retirado da máquina!\n", this.pet.getName());
        this.pet = null;
    }

    public void wash() {
        this.water -= 2;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Limpeza concluída!");
    }
}

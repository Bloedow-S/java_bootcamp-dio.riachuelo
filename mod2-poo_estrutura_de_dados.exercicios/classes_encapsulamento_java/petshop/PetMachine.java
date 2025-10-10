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

        water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        System.out.printf("O pet %s está na máquina!", pet.getName());
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}

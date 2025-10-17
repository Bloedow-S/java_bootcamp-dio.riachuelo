public class Pet {

    private final String name;
    private final String owner;
    private boolean cleanPet;

    Pet(String name, String owner) {  //somente name e owner são parâm. recebidos
        this.name = name;
        this.owner = owner;
        this.cleanPet = false; //clean por default é false.
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setCleanPet(boolean cleanPet) {
        this.cleanPet = cleanPet;
    }
}

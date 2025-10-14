public class Pet {

    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    public String getName() {
        return name;
    }

    //verifica o valor booleano de clean, se true ou false. substitui o getClean.
    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean){
        this.clean = clean;
    }
}

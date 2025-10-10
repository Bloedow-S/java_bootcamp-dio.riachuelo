/*Interessante mencionar que ao invés de enviar o pet por parâm. em takeashower takeback,
* como pet é uma param. da máquina
* chamamos e usamos dentro dos métodos o valor do próprio atrib. assim as funções dependem de uma instância
* por vez. isso permite o armazenamento de quem está na máquina pela própria classe máquina
* caso contrário, deveríamos armazenar os parâmetros enviados em outro lugar p saber qm foi o último add
* na máq.*/


public class Main {
    public static void main(String[] args) {
        var maq = new PetMachine();
        var pet1 = new Pet("Salsa");
        var estado = pet1.isClean() ? "Está limpo." : "Está sujo";
        System.out.printf("O pet %s está limpo? %s ", pet1.getName(), estado);
        maq.setPet(pet1);
        maq.takeAShower();
    }
}

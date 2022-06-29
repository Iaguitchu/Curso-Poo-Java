package Aula12;

public class Cachorro extends Mamifero {

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    @Override
    public void emitirSOm() {
        System.out.println("Au!Au!Au!");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
}

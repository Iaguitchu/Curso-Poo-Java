package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        p1.depositar(500);
        p1.sacar(1000);
        p1.estadoAtual();

    }
}

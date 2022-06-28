package Aula11;

public class main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Iago");
        v1.setIdade(22);
        v1.setSexo("M");
        Aluno a1 = new Aluno();
        a1.setNome("Mathias");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println(v1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Professor p1 = new Professor();
        p1.setNome("Rogério");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.receberAumento(45.0f);
        p1.receberAumento(45.0f);


    }
}

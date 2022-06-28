package Aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
        System.out.println(" O salario de "+ this.nome + " atualizou para " + getSalario());

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    private float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }
}

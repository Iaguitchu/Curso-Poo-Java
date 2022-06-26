package Aula05;

public class Banco {
    public int numConta;
    protected String tipo;
    public String dono;
    public double saldo;
    public boolean status;

    public void estadoAtual(){
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }



    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "cc"){
            this.setSaldo(50);
        } else if (t == "cp"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo()< 0){
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

        }

    public void depositar(double v){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else {
            System.out.println("impossivel depositar em uma conta fechada");
        }

    }
    public void sacar(double v){
        if(this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
            }
        }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 12;
        }else if(this.getTipo() == "cp"){
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar uma conta fechada");

        }



    }

    public void ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return dono;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }


}


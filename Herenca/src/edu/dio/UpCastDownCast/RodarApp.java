package edu.dio.UpCastDownCast;

public class RodarApp {
    public static void main(String[] args) {

        // criando objeto
        Funcionario funcionario = new Funcionario();


        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DownCast (apresentará erro)
        Vendedor vendedor1 = (Vendedor) new Funcionario();





    }
}

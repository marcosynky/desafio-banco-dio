<<<<<<< HEAD

//Classe Main
public class Main {
    public static void main(String[] args) { //Método main

        Cliente clienteCorrente = new Cliente("João Silva"); //Instanciação
        Cliente clientePoupanca = new Cliente("Maria Oliveira"); //Instanciação


        Conta cc = new ContaCorrente(clienteCorrente);//Instanciação
        Conta poupanca = new ContaPoupanca(clientePoupanca); //Instanciação


        cc.depositar(300); //Depósito
        poupanca.depositar(100); //Depósito


        cc.transferir(100, poupanca);//Transferência
        poupanca.transferir(0, cc); //Transferência


        cc.sacar(100); //Saque
        poupanca.sacar(50); //Saque


        cc.imprimirExtrato(); //Impressão
        poupanca.imprimirExtrato(); //Impressão
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> 73094364a3c84da3bb5c8e80c5bb9ed01ef5b043
    }
}
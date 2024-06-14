public class Conta {
private Double saldo;
public void setSaldo(Double saldo){
    this.saldo = saldo;
}
public Double getSaldo(){
    return saldo;
}
public void depositar(Double valor){
    saldo += valor;
    System.out.println("Valor depositado: "+valor);
}
public void saque(Double valorsaque){
    if (saldo < valorsaque) {
    System.out.println("Saldo insuficiente para essa transação");
    } else {
        System.out.println("Saque efetuado no valor de: "+ valorsaque);
	    saldo-=valorsaque;
    }
    verificaSaldo();
}
public void verificaSaldo(){
    System.out.println("Saldo atual: "+getSaldo());
}
}


public class Deposito extends Cajero{
    @Override
    public void Transacciones() {
        System.out.println("Cuento desea depositar?");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-----------------------");
        System.out.println("Depositaste: "+ deposito);
        System.out.println("Su saldo actual es de: " + getSaldo());
        System.out.println("-----------------------");
    }
}

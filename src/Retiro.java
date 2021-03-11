public class Retiro extends Cajero{
    @Override
    public void Transacciones() {
        System.out.println("-------------------------");
        System.out.println("Cuanto deseas retirar?");
        System.out.println("-------------------------");
        Extraccion();
        if (retiro > getSaldo()){
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }else {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-----------------------");
            System.out.println("Retiro: "+ retiro);
            System.out.println("Su saldo actual es de: " + getSaldo());
            System.out.println("-----------------------");
        }
    }
}

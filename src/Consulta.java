public class Consulta extends Cajero{


    @Override
    public void Transacciones() {
        System.out.println("---------------------------------");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("---------------------------------");
    }
}

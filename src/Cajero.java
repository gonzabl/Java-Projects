import java.util.Scanner;

public abstract class Cajero {

    protected float transacciones, deposito, retiro;
    private  static float saldo;


    Scanner entrada = new Scanner(System.in);
    int opcion = 0;

    public void Operaciones(){
        do {
                System.out.println("Seleccione una opcion:\n");
                System.out.println("    1. Extraer Saldo.\n");
                System.out.println("    2. Depositar saldo.\n");
                System.out.println("    3. Consulta de Saldo.\n");
                System.out.println("    4. Salir.\n");
                opcion = entrada.nextInt();
                switch (opcion){
                    case 1: Cajero ret = new Retiro();
                            ret.Transacciones();
                        break;
                    case 2: Cajero dep = new Deposito();
                            dep.Transacciones();
                        break;
                    case 3: Cajero consulta = new Consulta();
                            consulta.Transacciones();
                        break;
                    case 4:
                        System.out.println("------------------------");
                        System.out.println("Gracias, vuelva pronto!");
                        System.out.println("------------------------");
                        break;
                    default:
                        System.out.println("-------------------------------------");
                        System.out.println("Opcion no valida!");
                        System.out.println("-------------------------------------");
                        Operaciones();
                }
        }while(opcion !=4);
    }

    public void Extraccion(){
        retiro = entrada.nextFloat();
    }

    public void Deposito(){
        deposito = entrada.nextFloat();
    }

    public abstract void Transacciones();

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Cajero.saldo = saldo;
    }


}

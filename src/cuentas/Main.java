package cuentas;

/**
 * clase principal
 * @author sergio
 * @version 1.0
 */
public class Main {

	/**
	 * metodo principal
	 * @param args argumentos pasados por linea de comandos
	 */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * realiz una operacion con las cuentas
     * @param cantidad cantidad a operar
     */
	private static void operativa_cuenta(float cantidad) {
		CCuenta miCuenta;
        double saldoActual;
        
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}

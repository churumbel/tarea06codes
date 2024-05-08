package cuentas;
public class Main {

    public static void main(String[] args) {
    /**
     * La instanciación del objeto CCuenta se realiza dentro del método operativa_cuenta
     */
    	operativa_cuenta(2500);
    }

	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        /**
         * Aquí tenemos varios try catch para informar los fallos al momento de realizar la transacción
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
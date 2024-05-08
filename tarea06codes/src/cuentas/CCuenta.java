package cuentas;

/**
 * @author Diana
 * @version 1.0 (porque es la primera versión de la tarea)
 * @since 8 de mayo de 2024 (día que hice la actividad)
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Hoy dos constructores. Uno vacío y otro que recibe los atributos nombre, cuenta y saldo.
     */
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * El estado devuelve el saldo 
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * El método ingresar permite ingresar cantidades positivas en la cuenta.
     * Arroja una excepción. 
     * @exception si la cantidad es inferior a cero
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Para poder retirar dinero de la cuenta es preciso que la cantidad sea positiva y que el saldo sea suficiente. Arroja dos excepciones. 
     * @exception si la cantidad es negativa
     * @exception si el saldo es insuficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * Los getters y setters de los atributos de CCuenta. 
     * Get saldo quizás no tiene mucho sentido si tenemos el método 'estado' que nos retorna el saldo.
     */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}
package cuentas;
/**
 * clase que representa una cuenta corriente
 * @author sergio
 * @version 1.0
 */
public class CCuenta {

	/**
	 * devuelve el nombre del titular
	 * @return el nombre del titular
	 */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * establece el nombre del titular
     * @param nombre el nuevo nombre del titular
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * obtiene el numero de cuenta
	 * @return el numero de cuenta 
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * establece el numero de la cuenta
	 * @param cuenta es el nuevo numero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * consulta el saldo
	 * @return el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * establece el nuevo saldo
	 * @param saldo el nuevo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * consigue el tipo de interes
	 * @return el tipo de interes
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * establece nuevo tipo de interes	
	 * @param tipoInterés nuevo tipo de interes
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * nombre del titular
	 */
	private String nombre;
	/**
	 * numero de cuenta
	 */
    private String cuenta;
    /**
     * saldo de la cuenta
     */
    private double saldo;
    /**
     * tipo de interes
     */
    private double tipoInterés;

    /**
     * crea una cuenta vacia
     */
    public CCuenta()
    {
    }

    /**
     * crea una cuenta
     * @param nom nobre del titular
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * obtiene el saldo
     * @return el saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * ingresa una cantidad
     * @param cantidad cantidad a ingresar
     * @throws Exception en caso de ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retira una cantidad
     * @param cantidad es la cantidad a retirar
     * @throws Exception en caso de que la cantidad sea negativa o no haya suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

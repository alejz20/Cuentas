package Cuentas;
/* 
 * @author alejandra
 * @version 4.22.0 eclipse
 * 
 * 
 * */
public class CCuenta {

 
    private dString nombre;
   	private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }
    
    /*
	  * Declaracion de variables
	  * 
	  * @param nombre de tipo String declarado 'nom'
	  * @param cuenta de tipo string  declarado 'cue'
	  * @param saldo de tipo double declararado 'sal'
	  *
	  *  
	  *  */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    

	 
    public double estado()
    {
        return saldo;
    }
    /* 
     * @return saldo 
     * 
     * Este metodo nos devuelve el contenido de saldo
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad; 
    }
    /*
	  * Metodo ingresar
	  * 
	  * @exception cantidad
	  *  */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /*
	  * Metodo retirar
	  * 
	  * @exception cantidad
	  *  */
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

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

    /*
	  * De clase CCuenta
	  * 
	  * @param nombre, cuenta, saldo, tipoInteres
	  * 
	  * getters y setters
	  *  */
}

package cuentas;

/**
 * Clase que representa unha conta bancaria.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom  Nome do titular da conta.
     * @param cue  Número de conta.
     * @param sal  Saldo inicial.
     * @param tipo Tipo de interese.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Obtén o nome do titular da conta.
     *
     * @return Nome do titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o nome do titular da conta.
     *
     * @param nombre Nome do titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtén o número de conta.
     *
     * @return Número de conta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece o número de conta.
     *
     * @param cuenta Número de conta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtén o saldo actual da conta.
     *
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece o saldo da conta.
     *
     * @param saldo Saldo da conta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtén o tipo de interese da conta.
     *
     * @return Tipo de interese.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece o tipo de interese da conta.
     *
     * @param tipoInteres Tipo de interese.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtén o saldo actual da conta.
     *
     * @return Saldo actual.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa unha cantidade na conta.
     *
     * @param cantidad Cantidade a ingresar.
     * @throws Exception Se a cantidade é negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira unha cantidade da conta.
     *
     * @param cantidad Cantidade a retirar.
     * @throws Exception Se a cantidade é negativa ou non hai suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
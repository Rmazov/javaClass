public class Cuenta {
    //Atributos de la clase
    private double  saldoDeCuenta;
    private String nombreDelTitular;
    private  long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta ){
        this.saldoDeCuenta  =  saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = (long)(Math.random()*22055045+145);
    }

    public String getDatosCuenta(){
        return "El nombre del titular es "+this.nombreDelTitular+" Numero de cuenta "+ this.numeroDeCuenta+" saldo actual "+ this.saldoDeCuenta;
    }

    public void setIngreso(double ingreso) {
        this.saldoDeCuenta +=ingreso;
    }
    public void setRetiro(double retiro) {
        this.saldoDeCuenta -=retiro;
    }

    public double getSaldoCuenta(){
        return this.saldoDeCuenta;
    }
}

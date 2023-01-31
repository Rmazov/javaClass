public class Main {
    public static void main(String[] args) {
     Cuenta cuentaRicardo = new Cuenta("ricardo",5000);

     System.out.println( cuentaRicardo.getDatosCuenta());

     cuentaRicardo.setIngreso(7000);
     System.out.println(cuentaRicardo.getSaldoCuenta());
     cuentaRicardo.setRetiro(10000);
     System.out.println(cuentaRicardo.getSaldoCuenta());
     System.out.println( cuentaRicardo.getDatosCuenta());



    }
}
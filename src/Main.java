import javax.swing.*;

public class Main {
    public static void main(String[] args) {
     Cuenta cuentaRicardo = new Cuenta("ricardo",5);
     Cuenta cuentaEsteban = new Cuenta("esteban",1);
        Banco banco = new Banco(cuentaRicardo, cuentaEsteban);
        double  valorRetiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor a tranferir"));


        banco.transferir(cuentaRicardo, cuentaEsteban,valorRetiro);




     /*System.out.println( cuentaRicardo.getDatosCuenta());

     cuentaRicardo.setIngreso(1);
     System.out.println(cuentaRicardo.getSaldoCuenta());
     cuentaRicardo.setRetiro(7);*/
     //System.out.println(cuentaRicardo.getSaldoCuenta());
     //System.out.println( cuentaRicardo.getDatosCuenta());

   /*     Cuenta cuentaMateo = new Cuenta("nombre", 18, 1321312);
        Cuenta cuentaJuan = new Cuenta("nombre", 17, 6575675);
        Banco banco =  Banco(cuentaMateo, cuentaJuan);
        banco.transferir(cuentaMateo, cuentaJuan, 100);*/
     /*   Banco
        solo puede tener 2 cuentas.

                transferir(cuenta1, cuenta 2, monto)
        Cuenta deposito tiene monto.

        agregarNuevoSaldo(saldoActual)
                -anterior mas el saldoActual

        ValidarMonto(monto)
                - anterior - monto > 0
               */


    }
}
public class Banco  {


    private double  saldoDeCuenta1;
    private double  saldoDeCuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2 ){
        this.saldoDeCuenta1  = cuenta1.getSaldoCuenta();
        this.saldoDeCuenta2  = cuenta2.getSaldoCuenta();


    }

    public double transferir ( Cuenta cuenta1, Cuenta cuenta2, double valorRetiro ){
        System.out.println("saldo inicial cuenta1 "+cuenta1.getSaldoCuenta());
        System.out.println("saldo inicial cuenta2 "+cuenta2.getSaldoCuenta());
       if(cuenta1.setRetiro(valorRetiro)){

            cuenta2.setIngreso(valorRetiro);
             System.out.println("saldo final cuenta1 "+cuenta1.getSaldoCuenta());
           System.out.println("saldo final cuenta2 "+cuenta2.getSaldoCuenta());
       }else{
           System.out.println("saldo insuficiente");
           System.out.println("saldo actual cuenta1 "+cuenta1.getSaldoCuenta());
           System.out.println("saldo actual cuenta2 "+cuenta2.getSaldoCuenta());
       }

        return this.saldoDeCuenta1;
    }



}

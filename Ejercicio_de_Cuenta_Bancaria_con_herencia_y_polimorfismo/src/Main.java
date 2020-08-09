
public class Main {
	public static void multiplesDeposito(CuentaBancaria cta) {
		cta.deposito(100);
		cta.deposito(200);
		cta.deposito(300);
	}
	public static void main(String args[]) {
		CuentaAhorro cta1 = new CuentaAhorro();
		CuentaBancaria cta2 = new CuentaCorriente();
		
		cta1.deposito(800);
		cta2.deposito(500);
		
		/*
		multiplesDeposito(cta1):
		multiplesDeposito(cta2):
		
		cta1.imprimerSaldo();
		System.out.println(cta1 instancef CuentaBancaria);
		System.out.println(cta1 instancef CuentaAhorro);
		System.out.println(cta1 instancef CuentaCorriente);		
		*/
		
		System.out.println(cta1.getSaldo());
		System.out.println(cta2.getSaldo());		
	}

}

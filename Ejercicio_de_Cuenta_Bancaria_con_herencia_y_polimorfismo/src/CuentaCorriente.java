
public class CuentaCorriente extends CuentaBancaria{
	@Override
	public void deposito(double dinero) {
		double unoPorciento=0;
		if (dinero<=100) {
			unoPorciento = dinero*0.01;
		}
		double totalDeposito = dinero + unoPorciento;
		super.deposito(dinero);
	}
}

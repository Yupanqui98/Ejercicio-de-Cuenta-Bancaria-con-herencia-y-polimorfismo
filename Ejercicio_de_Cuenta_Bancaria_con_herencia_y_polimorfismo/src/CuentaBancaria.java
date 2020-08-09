
public class CuentaBancaria {
	private String propietario;
	private double saldo;
	
	public String getPropietario(){
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double dinero) {
		saldo += dinero;
	}
	public void retiro(double dinero) {
		saldo -= dinero;
	}
}

	
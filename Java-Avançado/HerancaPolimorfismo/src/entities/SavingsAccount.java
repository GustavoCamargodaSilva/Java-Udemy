package entities;

public  class SavingsAccount extends Account{ //Usado para fazer a herança do metodo Account
	private Double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate; 
	} //Se inicia o construtor com o super e so instacia o que vai vir de novo

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withDraw(double amount) { //Subscrevendo o metodo para nao descontar os
		balance -= amount; 					// 5 reais, se usa @Override para o compilador entender
	} //Colocado final para evitar que um metodo sobreposto
	  //Seja sobreposto novamente, pois pode gerar inconsistencia no sistema.
}

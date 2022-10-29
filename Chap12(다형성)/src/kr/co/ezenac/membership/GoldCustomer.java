package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {

	double salesRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);

		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;

		System.out.println("GoldCustomer(int, String) 생성자 호출");

	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}
}

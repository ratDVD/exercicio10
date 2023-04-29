package entities;

public class ImportedProducts extends Product {

	private Double customsFee;

	public ImportedProducts() {
		super();
	}

	public ImportedProducts(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.getName() + " $ ");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append(" (Customs fee: $ ");
		sb.append(String.format("%.2f", customsFee) + ")");

		return sb.toString();
	}
}

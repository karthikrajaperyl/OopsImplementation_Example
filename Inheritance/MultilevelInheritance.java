package Inheritance;

enum WorkStatus {
	Excellent, Good, Normal
}

class MTSSalary {
	protected int amount;

	MTSSalary(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void updateAmount(int amount) {
		this.amount = amount;
	}
}

class PerformanceSalary extends MTSSalary {

	PerformanceSalary(int amount) {
		super(amount);
	}

	public void workStatus(WorkStatus status) {
		if (WorkStatus.Excellent == status) {
			amount += 2000;
		}
		if (WorkStatus.Good == status) {
			amount += 1000;
		}
		if (WorkStatus.Normal == status) {
			amount += 500;
		}
		updateAmount(amount);
	}
}

class TotalSalary extends PerformanceSalary {

	TotalSalary(int amount) {
		super(amount);
		updateAmount(amount + getBonus());
	}

	private int getBonus() {
		return 5000;
	}
}

public class MultilevelInheritance extends TotalSalary{
	private int totalAmount;
	MultilevelInheritance(int amount)
	{
		super(amount);
	}
	public static void main(String[] args) {
		MultilevelInheritance totalSalary = new MultilevelInheritance(0);
		totalSalary.workStatus(WorkStatus.Excellent);
		totalSalary.totalAmount += totalSalary.getAmount();
		System.out.println("Total Amount-" + totalSalary.totalAmount);
	}
}


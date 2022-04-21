package Main;

enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {
	// ref of the enum
	AccountTypes accountTypes;

// class constructor
	public Accounts(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}

	// method to chose account types
	public void choseAccount() {
		switch (accountTypes) {
		case CHECKING:
			System.out.println("You chose checking");
			break;
		case SAVINGS:
			System.out.println("You chose SAVINGS");
			break;

		case CREDIT:
			System.out.println("You chose CREDIT");
			break;

		}
	}

}
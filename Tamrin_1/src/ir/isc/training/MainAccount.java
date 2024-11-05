package ir.isc.training;

import java.time.LocalDateTime;


public class MainAccount {

	public static void main(String[] args) {
		LocalDateTime opened = LocalDateTime.of(2020, 10, 3, 0, 0);

		
		//BankAccount bankAccount = new  BankAccountEmptyConstructor();

		@SuppressWarnings("unused")
		Account account1 = new Account("yalda",opened,205.000,false);
	}

}

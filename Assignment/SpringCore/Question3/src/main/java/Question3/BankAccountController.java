package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		BankAccountServiceImpl bA = (BankAccountServiceImpl) context.getBean("bankAccountService");
		System.out.println("Withdrawn:  \nAvail Amount = "+ bA.withdraw(999, 5));
		System.out.println("\n");
		System.out.println("Deposited: \nAvail Amount = " + bA.deposit(999, 10));
		System.out.println("\n");
		System.out.println("Fundtransfer from Janmesh's Account to Sudhnit's Account: \nAvail Amount= "+bA.fundTransfer(999, 997, 10));
		System.out.println("\n");
		System.out.println("Total Balance = "+bA.getBalance(999));
	}

}
/* <property name="bankAccount">
	<list>
	<ref bean="bankAccount1" />
	<ref bean="bankAccount2" />
	<ref bean="bankAccount3" />
</list>
</property> */
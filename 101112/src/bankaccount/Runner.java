package bankaccount;

public class Runner {
	
	public static void main(String[] args) {
		String me = "Abhi";
		double money = 1000.0;
		Account mine = new Account(me,money); 
		System.out.println(mine.toString());
		mine.deposit(555555);
		System.out.println(mine.toString());
		mine.withdrawal(44674389);
	}
	
	

}

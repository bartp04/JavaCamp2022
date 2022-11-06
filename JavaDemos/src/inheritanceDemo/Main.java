package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(teacherCreditManager);
		

	}

}

package Day4employee;

import Day4employee.Day4emp1;

public class Day4emp2 {
	    public static void main(String[] args) {
	        System.out.println("Welcome Employee");
	        System.out.println("------------------------------------------------");
	        Day4emp1 emp = new Day4emp1();
	        emp.isEmpPresent("Roshan");

	        emp.calcuDailyWage(8, "FULL TIME");

	        Day4emp1.wagesOfMonth();

	        emp.wagestillhour();

	        emp.wagestillDays();
	    }
	}
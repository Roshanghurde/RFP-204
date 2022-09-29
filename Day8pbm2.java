package Day_8_problems;

import Day_8_problems.Day8pbm1;

public class Day8pbm2 {


	  public static void main(String[] args) {
	        System.out.println("Welcome Employee");
	        System.out.println("------------------------------------------------");
	        Day8pbm1 emp = new Day8pbm1();
	        emp.isEmpPresent("Roshan");

	        emp.calcuDailyWage(8, "FULL TIME");

	        Day8pbm1.wagesOfMonth();

	        emp.wagestillhour();

	        emp.wagestillDays();
	    }
	}
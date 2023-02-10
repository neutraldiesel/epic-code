import acm.program.ConsoleProgram;
import java.text.DecimalFormat;

public class dayDifference extends ConsoleProgram{
	
	private static final long serialVersionUID = 1L;


	
	public void run() {
	setFont("times new roman-25");
	DecimalFormat myFormat = new DecimalFormat("###");

	while (true) {
	 double year = readInt("Enter year = ");	
	 double month = readInt("Enter month = ");
	 double date = readInt("Enter date = ");
	 double year0 = readInt("Enter 2nd year = ");	
	 double month0 = readInt("Enter 2nd month = ");
	 double date0 = readInt("Enter 2nd date = ");
	 
	 
	 String lyear = null;
	 int tDay = 0;
	 int tDay0 = 0;
	 
	if (year%100 == 0){
		if (year%4 == 0 && year%400 == 0){
			/*println("Leap Year");*/
			 lyear = ("leap");
		}
		else{
			/*println("Not a Leap Year");*/
			lyear = ("not");
		}
	}
	else if (year%100 != 0 && year%4 == 0){
		/*	println("Leap Year");*/
			 lyear = ("leap");
	}
	else{
		/*println("Not a Leap Year");*/
		lyear = ("not");
	}
	double year1 = ((year-1) * 365);
	double leap1 = Math.floor((year-1)/4);
	double leap2 = Math.floor((year-1)/400);
	double leap3 = Math.floor((year-1)/100);
	
	double year01 = ((year0-1) * 365);
	double leap01 = Math.floor((year0-1)/4);
	double leap02 = Math.floor((year0-1)/400);
	double leap03 = Math.floor((year0-1)/100);
	
	double year2 = year1 + leap1 - leap3 + leap2;
	double year02 = year01 + leap01 - leap03 + leap02;
	/*println(Math.round((year2)));*/
	
	if (lyear.equals ("leap")){
		/*println("asdf");*/
		if (month == 1){
			int days = 0;
			 tDay = (int) (date + days);
		}
		else if (month == 2){
			int days = 31;
			 tDay = (int) (date + days);
		}
		else if (month == 3){
			int days = 60;
			 tDay = (int) (date + days);
		}
		else if (month == 4){
			int days = 91;
			 tDay = (int) (date + days);
		}
		else if (month == 5){
			int days = 121;
			 tDay = (int) (date + days);
		}
		else if (month == 6){
			int days = 152;
			 tDay = (int) (date + days);
		}
		else if (month == 7){
			int days = 182;
			 tDay = (int) (date + days);
		}
		else if (month == 8){
			int days = 213;
			 tDay = (int) (date + days);
		}
		else if (month == 9){
			int days = 244;
			 tDay = (int) (date + days);
		}
		else if (month == 10){
			int days = 274;
			 tDay = (int) (date + days);
		}
		else if (month == 11){
			int days = 305;
			 tDay = (int) (date + days);
		}
		else if (month == 12){
			int days = 335;
			
			tDay =  (int) (date + days);
		}
	}

	 if (lyear.equals ("not")){
		/*println("zzzz");*/
		if (month == 1){
			int days = 0;
			tDay = (int) (date + days);
		}else if (month == 2){
			int days = 31;
			 tDay = (int) (date + days);
		}
		else if (month == 3){
			int days = 59;
			 tDay= (int) (date + days);
		}
		else if (month == 4){
			int days = 90;
			 tDay = (int) (date + days);
		}
		else if (month == 5){
			int days = 120;
			 tDay = (int) (date + days);
		}
		else if (month == 6){
			int days = 151;
			 tDay = (int) (date + days);
		}
		else if (month == 7){
			int days = 181;
			 tDay = (int) (date + days);
		}
		else if (month == 8){
			int days = 212;
			 tDay = (int) (date + days);
		}
		else if (month == 9){
			int days = 243;
			 tDay = (int) (date + days);
		}
		else if (month == 10){
			int days = 273;
			 tDay = (int) (date + days);
		}
		else if (month == 11){
			int days = 304;
			 tDay = (int) (date + days);
		}
		else if (month == 12){
			int days = 334;
			 tDay = (int) (date + days);
		}
	}
	 if (lyear.equals ("leap")){
			/*println("asdf");*/
			if (month0 == 1){
				int days0 = 0;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 2){
				int days0 = 31;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 3){
				int days0 = 60;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 4){
				int days0 = 91;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 5){
				int days0 = 121;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 6){
				int days0 = 152;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 7){
				int days0 = 182;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 8){
				int days0 = 213;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 9){
				int days0 = 244;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 10){
				int days0 = 274;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 11){
				int days0 = 305;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 12){
				int days0 = 335;
				
				tDay0 =  (int) (date0 + days0);
			}
		}

		 if (lyear.equals ("not")){
			/*println("zzzz");*/
			if (month0 == 1){
				int days0 = 0;
				tDay0 = (int) (date0 + days0);
			}else if (month0 == 2){
				int days0 = 31;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 3){
				int days0 = 59;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 4){
				int days0 = 90;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 5){
				int days0 = 120;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 6){
				int days0 = 151;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 7){
				int days0 = 181;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 8){
				int days0 = 212;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 9){
				int days0 = 243;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 10){
				int days0 = 273;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 11){
				int days0 = 304;
				 tDay0 = (int) (date0 + days0);
			}
			else if (month0 == 12){
				int days0 = 334;
				 tDay0 = (int) (date0 + days0);
			}
		}
		/*println(tDay);*/
		
		int totDays = (int) (year2 + tDay);
		int totDays0 = (int) (year02 + tDay0);
		int finalDays = totDays0 - totDays;

		print("There are " + finalDays + " days between " + (myFormat.format(year)) + "/" + (myFormat.format(month)) + "/" + (myFormat.format(date)));
		println(" and " + (myFormat.format(year0)) + "/" + (myFormat.format(month0)) + "/" + (myFormat.format(date0)+"\n"));
		
		/*println(totDays);*/
		
		/*if (totDays%7 == 0){
			println("Sunday");
		}
		else if (totDays%7 == 1){
			println("Monday");
		}
		else if (totDays%7 == 2){
			println("Tuesday");
		}
		else if (totDays%7 == 3){
			println("Wednesday");
		}
		else if (totDays%7 == 4){
			println("Thursday");
		}
		else if (totDays%7 == 5){
			println("Friday");
		}
		else if (totDays%7 == 6){
			println("Saturday");*/
		}
		
	/*String loop = readLine("\nDo you want to find another day? y/n ");	
		if(loop.equals ("y")){
			continue;
		}
		else{
			break;*/
		}
	}


	
	
	
	
